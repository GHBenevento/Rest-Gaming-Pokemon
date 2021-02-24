package unittesting.Classes.actions;

import unittesting.Classes.poke_data.Pokemon;

public class UserAction {
    private Pokemon pokemon;
    private Integer currentXp;
    private Integer newXp;

    public UserAction(Pokemon pokemon, Integer currentXp, Integer newXp){
        setPokemon(pokemon);
        setCurrentXp(currentXp);
        setNewXp(newXp);
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
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

