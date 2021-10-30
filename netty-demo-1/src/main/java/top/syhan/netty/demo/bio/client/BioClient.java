package top.syhan.netty.demo.bio.client;

import java.io.IOException;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @program: netty-demo-1
 * @description: bio客户端
 * @author: SYH
 * @Create: 2021-10-30 21:38
 **/
public class BioClient {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("192.168.2.196", 8000);
            System.out.println("BIO客户端启动成功！");
            BioClientHandler bioClientHandler = new BioClientHandler(socket, StandardCharsets.UTF_8);
            bioClientHandler.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
