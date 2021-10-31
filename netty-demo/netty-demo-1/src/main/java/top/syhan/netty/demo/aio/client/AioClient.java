package top.syhan.netty.demo.aio.client;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Future;

/**
 * @program: netty-demo-1
 * @description: 客户端
 * @author: SYH
 * @Create: 2021-10-30 19:42
 **/
public class AioClient {

    public static void main(String[] args)throws Exception {
        AsynchronousSocketChannel socketChannel = AsynchronousSocketChannel.open();
        //改成你的IP地址
        Future<Void> future = socketChannel.connect(new InetSocketAddress("192.168.2.196", 7397));
        System.out.println("AIO客户端启动成功！");
        future.get();
        socketChannel.read(ByteBuffer.allocate(1024), null, new AioClientHandler(socketChannel, StandardCharsets.UTF_8));
        Thread.sleep(30000);
    }

}
