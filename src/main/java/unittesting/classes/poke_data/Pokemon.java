package unittesting.classes.poke_data;

import unittesting.classes.actions.UserAction;
import unittesting.classes.data.Gender;
import unittesting.classes.data.LifeBeing;
import unittesting.classes.service.GameService;

public class Pokemon extends LifeBeing {
    private Integer pokedexNumber;
    private boolean isLegendary;
    private PokeType type;
    private PokeType weakness;


    public Pokemon(String name, Integer pokedexNumber, String sType, String sGender, Double height, Double weight) {
        setName(name);
        setPokedexNumber(pokedexNumber);
        setType(PokeType.valueOf(sType));
        setWeakness(PokeType.valueOf(sType));
        setGender(Gender.valueOf(sGender));
        isLegendary(Gender.valueOf(sGender));
        setHeight(height);
        setWeight(weight);
        setStatus(status);
    }

    public Integer getPokedexNumber() {
        return pokedexNumber;
    }

    public void setPokedexNumber(Integer pokedexNumber) {
        this.pokedexNumber = pokedexNumber;
    }

    public PokeType getType() {
        return type;
    }

    public void setType(PokeType type) {
        this.type = type;
    }

    public PokeType getWeakness() {
        return weakness;
    }

    public void setWeakness(PokeType type) {
        weakness = switch (type) {
            case GRASS -> PokeType.FIRE;
            case WATER -> PokeType.GRASS;
            default -> PokeType.WATER;
        };
    }

    public boolean isLegendary() {
        return isLegendary;
    }


    public void setLegendary(boolean legendary) {
        isLegendary = legendary;
    }

    public void isLegendary(Gender gender) {
        if (gender == Gender.GENDERLESS) {
            isLegendary = true;
        }
    }

    public void eat() {
        if (status.getEnergy() <= 9) {
            System.out.println("Not enough energy, you need to sleep");
        } else {
            this.status.setHunger(status.getHunger() - 25);
            this.status.setEnergy(status.getEnergy() - 10);
            new UserAction(0);
        }
    }

    public void train() {
        if (status.getEnergy() <= 39) {
            System.out.println("Not enough energy, you need to sleep");
        } else {
            this.status.setXp(status.getXp() + 50);
            this.status.setEnergy(status.getEnergy() - 40);
            this.status.setHunger(status.getHunger() + 40);
            new UserAction(50);
        }
    }

    public void sleep() {
        this.status.setEnergy(100);
        this.status.setHunger(status.getHunger() + 15);
        new UserAction(0);
    }

}
