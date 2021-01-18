package com.gupaoedu.vip.pattern.command.homework.actions;

import com.gupaoedu.vip.pattern.command.homework.Action;
import com.gupaoedu.vip.pattern.command.homework.FTP;

/**
 * @author sunhao
 * @date Created in 2020-03-18 11:43
 * @description：
 */
public class StopAction implements Action {
    private FTP ftp;
    public StopAction(FTP ftp) {
        this.ftp = ftp;
    }
    public void execute() {
        ftp.stop();
    }
}
