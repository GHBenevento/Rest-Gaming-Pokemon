package unittesting.Classes.data1;

import unittesting.Classes.data2.Status;
import unittesting.Classes.data3.RenderType;

public class Pokemon extends LifeBeing {
    private Integer pokedexNumber;
    private PokeType type;
    private PokeType weakness;
    private boolean isLegendary;
    private Integer level;
    private Status status;

    public Pokemon(String name, Integer pokedexNumber, String sType, String sGender, Double height, Double weight) {
        setName(name);
        setPokedexNumber(pokedexNumber);
        setType(PokeType.valueOf(sType));
        setWeakness(PokeType.valueOf(sType));
        setGender(Gender.valueOf(sGender));
        setLegendary(Gender.valueOf(sGender));
        setHeight(height);
        setWeight(weight);
        setLevel(getStatus().getLvl());
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

        switch (type) {
            case FIRE:
                return PokeType.WATER;
            case WATER:
                return PokeType.GRASS;
            default:
                return PokeType.FIRE;
        }
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = new Status();
    }

    public boolean isLegendary() {
        return isLegendary;
    }

    public void setLegendary(Gender gender) {
        if (gender == Gender.GENDERLESS) {
            isLegendary = true;
        }
    }


    @Override
    public void eat() {

    }

    @Override
    public void train() {

    }

    @Override
    public void sleep() {

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
