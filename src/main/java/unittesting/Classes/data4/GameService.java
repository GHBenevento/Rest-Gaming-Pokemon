package unittesting.Classes.data4;

import org.springframework.stereotype.Service;
import unittesting.Classes.data1.LifeBeing;
import unittesting.Classes.data2.Action;
import unittesting.Classes.data2.UserAction;

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

    public List<UserAction> getUserActions() {
        return userActions;
    }

}
