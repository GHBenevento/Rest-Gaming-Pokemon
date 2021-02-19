package unittesting.Classes.data2;


import unittesting.Classes.data1.Pokemon;
import unittesting.Classes.data3.RenderType;

import java.util.LinkedList;
import java.util.List;

public interface IActions {

    static String doAction(){
        return "JSON";
    }

    static List<UserAction> getStats(){
        List actionList = new LinkedList();
        UserAction userAction = new UserAction();
        actionList.add(userAction);
        return actionList;
    }

    static RenderType doRender(RenderType render){

        return render;
    }

    static Pokemon reset(){
        Pokemon Poke = new Pokemon();
        return Poke;
    }

    static List<Action> getActions(){
        List actions = new LinkedList();
        actions.add(Action.SLEEP);
        return actions;
    }

    static Status getCurrentStatus(){
        Status status = new Status();
        return status;
    }
}
