package com.gupaoedu.vip.pattern.command.homework.actions;

import com.gupaoedu.vip.pattern.command.homework.Action;
import com.gupaoedu.vip.pattern.command.homework.FTP;

/**
 * @author sunhao
 * @date Created in 2020-03-18 11:42
 * @description：
 */
public class SpeedAction implements Action {
    private FTP ftp;
    public SpeedAction(FTP ftp) {
        this.ftp = ftp;
    }
    public void execute() {
        ftp.speed();
    }
}
