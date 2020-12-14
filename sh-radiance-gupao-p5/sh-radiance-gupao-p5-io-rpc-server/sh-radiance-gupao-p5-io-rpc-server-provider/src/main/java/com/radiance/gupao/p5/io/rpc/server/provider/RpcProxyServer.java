package com.radiance.gupao.p5.io.rpc.server.provider;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author sunhao
 * @date 2020/9/29 0:00
 * @Description:
 */
public class RpcProxyServer {

    private final ExecutorService executorService = Executors.newCachedThreadPool();

    public void publisher(Object service, int port){
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(port);
            while (true) {
                final Socket socket = serverSocket.accept();
                executorService.execute(new ProcessorHandler(socket, service));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // TODO
        }

    }

}
