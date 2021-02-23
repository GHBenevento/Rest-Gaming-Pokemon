package unittesting.Classes.data1;

import unittesting.Classes.data2.Status;
import unittesting.Classes.data3.RenderType;

public class Pokemon extends LifeBeing {
    private Integer pokedexNumber;
    private PokeType type;
    private PokeType weakness;
    private boolean isLegendary;
    private Status status;

    public Pokemon(String name, Integer pokedexNumber, String sType, String sGender, Double height, Double weight) {
        setName(name);
        setPokedexNumber(pokedexNumber);
        setType(PokeType.valueOf(sType));
        setWeakness(PokeType.valueOf(sType));
        setGender(Gender.valueOf(sGender));
        isLegendary(Gender.valueOf(sGender));
        setHeight(height);
        setWeight(weight);
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

    public PokeType setWeakness(PokeType type) {
        weakness = switch (type) {
            case GRASS -> PokeType.FIRE;
            case WATER -> PokeType.GRASS;
            default -> PokeType.WATER;
        };
        return  weakness;
    }

    public boolean isLegendary() {
        return isLegendary;
    }

    public void isLegendary(Gender gender) {
        if (gender == Gender.GENDERLESS) {
            isLegendary = true;
        }
    }

    public void setLegendary(boolean legendary) {
        isLegendary = legendary;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void eat() {
        this.status.setEnergy(status.getEnergy()+20);
        this.status.setXp(status.getXp()-5);
    }

    public void train() {
        this.status.setXp(status.getXp()+50);
        this.status.setEnergy(status.getEnergy()-40);
    }

    public void sleep() {
        this.status.setEnergy(100);
        this.status.setXp(status.getXp()-10);
    }

    @Override
    public String doRender(String renderType) {

        RenderType ourRender = RenderType.valueOf(renderType);

        switch (ourRender) {
            case HTML:
                return "";
            case JSON:
                return "";
            default:
                return "";
        }

    }
}
