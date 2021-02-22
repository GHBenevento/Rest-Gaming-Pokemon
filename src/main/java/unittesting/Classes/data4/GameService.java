package unittesting.Classes.data4;

import org.springframework.stereotype.Service;
import unittesting.Classes.data1.LifeBeing;
import unittesting.Classes.data2.Action;
import unittesting.Classes.data2.Status;
import unittesting.Classes.data2.UserAction;
import unittesting.Classes.data3.RenderType;

import java.util.ArrayList;
import java.util.List;

@Service("GameService")
public class GameService {
    private List<UserAction> userActions = new ArrayList<>();
    private Integer maxPoints;
    private LifeBeing currentLifeBeing;


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

    public void doAction(Action action) {
    }

    public void resetLifeBeing() {
    }

    public RenderType render() {
        return RenderType.HTML; //Es un ejemplo
    }

    public Status getStatus() {
        return new Status(); //ejemplo
    }

    public Action getAction() {
        return Action.EAT; //Es un ejemplo
    }

    public List<UserAction> getUserActions() {
        return userActions;
    }

}
