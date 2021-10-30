package top.syhan.netty.demo.bio.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @program: netty-demo-1
 * @description: BIO服务端
 * @author: SYH
 * @Create: 2021-10-30 21:42
 **/
public class BioServer extends Thread {

    private ServerSocket serverSocket = null;

    public static void main(String[] args) {
        BioServer bioServer = new BioServer();
        bioServer.start();
    }

    @Override
    public void run() {
        try {
            serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress(8000));
            System.out.println("BIO服务端启动成功！");
            while (true) {
                Socket socket = serverSocket.accept();
                BioServerHandler handler = new BioServerHandler(socket, StandardCharsets.UTF_8);
                handler.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
