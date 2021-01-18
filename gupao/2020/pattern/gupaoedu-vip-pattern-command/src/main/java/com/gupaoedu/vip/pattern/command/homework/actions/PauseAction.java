package com.gupaoedu.vip.pattern.command.homework.actions;

import com.gupaoedu.vip.pattern.command.homework.Action;
import com.gupaoedu.vip.pattern.command.homework.FTP;

/**
 * @author sunhao
 * @date Created in 2020-03-18 11:19
 * @description：
 */
public class PauseAction implements Action {
    private FTP ftp;
    public PauseAction(FTP ftp) {
        this.ftp = ftp;
    }
    public void execute() {
        ftp.pause();
    }
}
