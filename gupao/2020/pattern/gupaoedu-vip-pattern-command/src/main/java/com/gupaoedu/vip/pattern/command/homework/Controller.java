package com.gupaoedu.vip.pattern.command.homework;

import com.gupaoedu.vip.pattern.command.player.IAction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author sunhao
 * @date Created in 2020-03-18 11:07
 * @description：
 */
public class Controller {

    private List<Action> actions = new ArrayList<Action>();

    public void addAction(Action action){
        actions.add(action);
    }

    public void execute(Action action) {
        action.execute();
    }

    public void executes() {
        for (Action action : actions) {
            action.execute();
        }
        actions.clear();
    }
}
