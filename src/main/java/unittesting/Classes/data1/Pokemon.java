package unittesting.Classes.data1;

import unittesting.Classes.data2.Status;
import unittesting.Classes.data3.RenderType;

public class Pokemon extends LifeBeing {
    private Integer pokedexNumber;
    private PokeType type;
    private PokeType weakness;
    private boolean isLegendary;

    public Pokemon(String name, Integer pokedexNumber, String sType, String sGender, Double height, Double weight) {
        setName(name);
        setPokedexNumber(pokedexNumber);
        setType(PokeType.valueOf(sType));
        setWeakness(PokeType.valueOf(sType));
        setGender(Gender.valueOf(sGender));
        setLegendary(Gender.valueOf(sGender));
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

    public void setLegendary(Gender gender) {
        if (gender == Gender.GENDERLESS) {
            isLegendary = true;
        }
    }

    public void eat() {
    }

    public void train() {
    }

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
