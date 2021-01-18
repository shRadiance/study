package com.gupaoedu.vip.pattern.command.homework;

/**
 * @author sunhao
 * @date Created in 2020-03-18 11:05
 * @description：
 */
public class FTP implements IFTP{

    public void play(){
        System.out.println("正常播放");
    }

    public void speed(){
        System.out.println("拖动进度条");
    }

    public void stop(){
        System.out.println("停止播放");
    }

    public void pause(){
        System.out.println("暂停播放");
    }

}
