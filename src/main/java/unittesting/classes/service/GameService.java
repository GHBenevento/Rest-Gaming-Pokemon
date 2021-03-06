package unittesting.classes.service;

import org.springframework.stereotype.Service;
import unittesting.classes.data.LifeBeing;
import unittesting.classes.poke_data.Pokemon;
import unittesting.classes.actions.Action;
import unittesting.classes.data.Status;
import unittesting.classes.actions.UserAction;

import java.util.ArrayList;
import java.util.List;

@Service("GameService")
public class GameService {
    public static List<UserAction> userActions = new ArrayList<>();
    public static Integer maxPoints = 1;
    public static LifeBeing currentLifeBeing;

    public void addAction(UserAction userAction) {
        userActions.add(userAction);
    }

    public Integer getMaxPoints() {
        return maxPoints;
    }

    public static void setMaxPoints(Integer points) {
        if (points >= maxPoints) {
            maxPoints = points;
        }
    }

    public LifeBeing getCurrentLifeBeing() {
        return currentLifeBeing;
    }

    public void setCurrentLifeBeing(LifeBeing currentLifeBeing) {
        this.currentLifeBeing = currentLifeBeing;
    }


    public Pokemon newPokemon(String name, Integer pokedexNumber, String sType, String sGender, Double height, Double weight) {
        Pokemon newPoke = new Pokemon(name, pokedexNumber, sType, sGender, height, weight);
        this.setCurrentLifeBeing(newPoke);
        return newPoke;
    }

    public void doAction(Action action) {
        if (action == Action.EAT) {
            currentLifeBeing.eat();
        } else if (action == Action.TRAIN) {
            currentLifeBeing.train();
        } else {
            currentLifeBeing.sleep();
        }
    }

    public void render(String renderType) {
        currentLifeBeing.doRender(renderType);
    }

    public Status getStatus() {
        return currentLifeBeing.status;
    }

    public List<Action> getActions() {
        List<Action> possibleActions = new ArrayList<>();
        return possibleActions;
    }

    public List<UserAction> getUserActions() {
        return userActions;
    }


}
