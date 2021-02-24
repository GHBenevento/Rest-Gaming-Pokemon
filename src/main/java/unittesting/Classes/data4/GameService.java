package unittesting.Classes.data4;

import org.springframework.stereotype.Service;
import unittesting.Classes.data1.LifeBeing;
import unittesting.Classes.data1.Pokemon;
import unittesting.Classes.data2.Action;
import unittesting.Classes.data2.Status;
import unittesting.Classes.data2.UserAction;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@Service("GameService")
public class GameService {
    public static List<UserAction> userActions = new ArrayList<>();
    public static Integer maxPoints;
    public static LifeBeing currentLifeBeing;

    public void addAction(UserAction userAction){
        userActions.add(userAction);
    }
    public Integer getMaxPoints() {
        return maxPoints;
    }

    public void setMaxPoints(Integer maxPoints) {
        this.maxPoints = maxPoints;
    }

    public LifeBeing getCurrentLifeBeing() {
        return currentLifeBeing;
    }

    public void setCurrentLifeBeing(LifeBeing currentLifeBeing) {
        this.currentLifeBeing = currentLifeBeing;
    }


    public Pokemon newPokemon(String name, Integer pokedexNumber, String sType, String sGender, Double height, Double weight){
        Pokemon newPoke = new Pokemon(name, pokedexNumber, sType, sGender, height, weight);
        this.setCurrentLifeBeing(newPoke);
        return newPoke;
    }

    public void doAction(Action action) {
    }

    public void render(String renderType) {
        currentLifeBeing.doRender(renderType);
    }

    public Status getStatus(){
       return currentLifeBeing.status;
    }

    public List<Action> getActions(){
        List<Action> possibleActions = new ArrayList<>();
        return possibleActions;
    }

    public List<UserAction> getUserActions() {
        return userActions;
    }

}
