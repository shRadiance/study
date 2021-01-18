package com.gupaoedu.vip.pattern.command.homework.actions;

import com.gupaoedu.vip.pattern.command.homework.Action;
import com.gupaoedu.vip.pattern.command.homework.FTP;

/**
 * @author sunhao
 * @date Created in 2020-03-18 11:41
 * @description：
 */
public class PlayAction implements Action {

    private FTP ftp;
    public PlayAction(FTP ftp) {
        this.ftp = ftp;
    }
    public void execute() {
        ftp.play();
    }
}
