package top.syhan.chat.codec;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import top.syhan.chat.protocol.Packet;
import top.syhan.chat.util.SerializationUtil;

/**
 * @program: chat-server
 * @description: 编码器
 * @author: SYH
 * @Create: 2021-11-06 23:21
 **/
public class ObjEncoder extends MessageToByteEncoder<Packet> {

    @Override
    protected void encode(ChannelHandlerContext ctx, Packet in, ByteBuf out) {
        byte[] data = SerializationUtil.serialize(in);
        out.writeInt(data.length + 1);
        //添加指令
        out.writeByte(in.getCommand());
        out.writeBytes(data);
    }

}
