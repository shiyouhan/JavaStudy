package top.syhan.netty.demo.util;

import top.syhan.netty.demo.domain.MsgBody;

/**
 * @program: netty-demo
 * @description:
 * @author: SYH
 * @Create: 2021-11-02 22:41
 **/
public class MsgUtil {

    /**
     * 构建protobuf消息体
     */
    public static MsgBody buildMsg(String channelId, String msgInfo) {
        MsgBody.Builder msg = MsgBody.newBuilder();
        msg.setChannelId(channelId);
        msg.setMsgInfo(msgInfo);
        return msg.build();
    }

}
