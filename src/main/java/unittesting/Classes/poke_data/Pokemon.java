package unittesting.Classes.poke_data;

import unittesting.Classes.render.RenderType;

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
        this.status.setHunger(status.getHunger() - 20);
        this.status.setEnergy(status.getEnergy()- 10);
    }

    public void train() {
        this.status.setXp(status.getXp() + 50);
        this.status.setEnergy(status.getEnergy() - 40);
        this.status.setHunger(status.getHunger() + 40);
    }

    public void sleep() {
        this.status.setEnergy(100);
        this.status.setHunger(status.getHunger() + 15);
    }

    @Override
    public String doRender(String renderType) {

        RenderType ourRender = RenderType.valueOf(renderType);

        return switch (ourRender) {
            case HTML -> "";
            case JSON -> "";
            default -> "";
        };

    }
}
