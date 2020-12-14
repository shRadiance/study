package com.radiance.gupao.p5.io.network;

import java.io.*;
import java.net.Socket;

/**
 * @author sunhao
 * @date 2020/9/28 20:33
 * @Description:
 */
public class ClientSocketClass {

    public static void main(String[] args) {
        final int DEFAULT_PORT = 8080;
        try {
            //建立一个连接
            Socket socket = new Socket("localhost",8080);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bufferedWriter.write("我是客户端发送的消息：client-01\n");
            bufferedWriter.flush();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String serverStr  = bufferedReader.readLine();
            System.out.println("收到服务端的消息:" + serverStr);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
