package top.syhan.netty.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.syhan.netty.demo.server.NettyServer;

import javax.annotation.Resource;

/**
 * @program: netty-demo
 * @description: NettyController
 * @author: SYH
 * @Create: 2021-11-02 19:56
 **/
@RestController
@RequestMapping(value = "/server")
public class NettyController {

    @Resource
    private NettyServer nettyServer;

    @GetMapping("/address")
    public String localAddress() {
        return "Netty Server local Address：" + nettyServer.getChannel().localAddress();
    }

    @GetMapping("/open")
    public String isOpen() {
        return "Netty Server isOpen？" + nettyServer.getChannel().isOpen();
    }
}
