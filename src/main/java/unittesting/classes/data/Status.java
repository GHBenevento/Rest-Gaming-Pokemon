package unittesting.classes.data;

import unittesting.classes.service.GameService;

public class Status {

    private Integer energy;
    private Integer hunger;
    private Integer xp;
    private Integer lvl;

    public Status() {
        setEnergy(100);
        setHunger(0);
        setXp(0);
        setLvl(1);
    }

    public Integer getEnergy() {
        return energy;
    }

    public void setEnergy(Integer energy) {
        if (energy >= 100) {
            this.energy = 100;
        } else {
            this.energy = energy;
        }
    }

    public Integer getXp() {
        return xp;
    }

    public void setXp(Integer xp) {
        if (xp == 150) {
            this.setLvl(this.getLvl() + 1);
            this.setXp(0);
            GameService.setMaxPoints(lvl);
        }else {
            this.xp = xp;
        }
    }

    public Integer getLvl() {
        return lvl;
    }

    public void setLvl(Integer lvl) {
        this.lvl = lvl;
    }

    public Integer getHunger() {
        return hunger;
    }

    public void setHunger(Integer hunger) {
        if (hunger <= 0) {
            this.hunger = 0;
        } else {
            this.hunger = hunger;
        }
        if (hunger >= 100) {
            //reset
        }
    }


}
