package Classes.data1;

public class Pokemon extends LifeBeing {
    private Integer pokedexNumber;
    private PokeType type;
    private PokeType weakness;
    private boolean isLegendary;

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

    public PokeType setWeakness() {

        switch (type) {
            case FIRE:
                return PokeType.WATER;
            case WATER:
                return PokeType.GRASS;
            default:
                return PokeType.FIRE;
        }
    }

    public boolean isLegendary() {
        return isLegendary;
    }

    public void setLegendary(String Gender) {
        isLegendary = Gender.equals("GENDERLESS");
    }
}
