package top.syhan.netty.assistant.client;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @program: netty-assistant
 * @description:
 * @author: SYH
 * @Create: 2021-10-30 22:32
 **/
public class NettyClientHandler extends SimpleChannelInboundHandler<String> {

    @Override
    protected void channelRead0(ChannelHandlerContext context, String msg)
            throws Exception {
        System.out.println(msg);
    }

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        super.handlerAdded(ctx);
        System.out.println(ctx.name() + ctx.channel().localAddress() + "remote:" + ctx.channel().remoteAddress());
    }

}

