package com.radiance.gupao.p5.io.network;

import org.apache.catalina.connector.InputBuffer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

/**
 * @author sunhao
 * @date 2020/9/28 20:18
 * @Description:
 */
public class ServerSocketClass {

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        final int DEFAULT_PORT = 8080;
        //绑定一个监听端口
        try {
            serverSocket = new ServerSocket(DEFAULT_PORT);
            socket = serverSocket.accept();
            System.out.println("客户端:" + socket.getPort() + "已连接");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String clientStr = bufferedReader.readLine();
            System.out.println("收到客户端的请求消息:" + clientStr);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bufferedWriter.write("我已经收到了消息\n");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            serverSocket.close();
//            socket.close();
        }


    }

}
