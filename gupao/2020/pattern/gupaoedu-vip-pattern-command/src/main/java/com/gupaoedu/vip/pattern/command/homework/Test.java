package com.gupaoedu.vip.pattern.command.homework;

import com.gupaoedu.vip.pattern.command.homework.actions.PauseAction;
import com.gupaoedu.vip.pattern.command.homework.actions.PlayAction;
import com.gupaoedu.vip.pattern.command.homework.actions.SpeedAction;
import com.gupaoedu.vip.pattern.command.homework.actions.StopAction;

/**
 * @author sunhao
 * @date Created in 2020-03-18 11:53
 * @description：
 */
public class Test {

    public static void main(String[] args) {
        FTP ftp = new FTP();
        Controller controller = new Controller();
        controller.addAction(new PauseAction(ftp));
        controller.addAction(new PlayAction(ftp));
        controller.addAction(new StopAction(ftp));
        controller.addAction(new SpeedAction(ftp));
        controller.execute(new PauseAction(ftp));
        controller.executes();
    }

}
