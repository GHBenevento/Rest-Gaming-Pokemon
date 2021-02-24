package unittesting.Classes.data1;

import unittesting.Classes.data2.IActions;
import unittesting.Classes.data3.IRender;

public abstract class LifeBeing implements IRender, IActions {
    private String name;
    private Double height;
    private Double weight;
    private Gender gender;
    static Pokemon ourPokemon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public static Pokemon getOurPokemon() {
        return ourPokemon;
    }

    public static void setOurPokemon(Pokemon ourPokemon) {
        LifeBeing.ourPokemon = ourPokemon;
    }
}
