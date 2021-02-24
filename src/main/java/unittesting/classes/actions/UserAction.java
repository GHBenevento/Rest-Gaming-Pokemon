package unittesting.classes.actions;

import unittesting.classes.poke_data.LifeBeing;
import unittesting.classes.poke_data.Pokemon;
import unittesting.classes.service.GameService;

public class UserAction {
    private LifeBeing currentLifeBeing;
    private Integer currentXp;
    private Integer newXp;

    public UserAction(Integer xp) {
        setCurrentLifeBeing(GameService.currentLifeBeing);
        setCurrentXp(currentLifeBeing.status.getXp());
        setNewXp(xp);
        GameService.userActions.add(this);
    }

    public LifeBeing getCurrentLifeBeing() {
        return currentLifeBeing;
    }

    public void setCurrentLifeBeing(LifeBeing currentLifeBeing) {
        this.currentLifeBeing = currentLifeBeing;
    }

    public Integer getCurrentXp() {
        return currentXp;
    }

    public void setCurrentXp(Integer currentXp) {
        this.currentXp = currentXp;
    }

    public Integer getNewXp() {
        return newXp;
    }

    public void setNewXp(Integer newXp) {
        this.newXp = newXp;
    }
}

