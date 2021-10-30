package top.syhan.netty.demo.nio.client;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

/**
 * @program: netty-demo-1
 * @description: NIO客户端
 * @author: SYH
 * @Create: 2021-10-30 22:06
 **/
public class NioClient {

    public static void main(String[] args) throws IOException {
        Selector selector = Selector.open();
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.configureBlocking(false);

        boolean isConnect = socketChannel.connect(new InetSocketAddress("192.168.2.196", 7397));
        if (isConnect) {
            socketChannel.register(selector, SelectionKey.OP_READ);
        } else {
            socketChannel.register(selector, SelectionKey.OP_CONNECT);
        }
        System.out.println("NIO客户端启动成功！");
        new NioClientHandler(selector, StandardCharsets.UTF_8).start();
    }
}
