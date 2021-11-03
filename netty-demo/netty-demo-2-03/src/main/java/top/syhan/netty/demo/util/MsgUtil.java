package top.syhan.netty.demo.util;

import top.syhan.netty.demo.domain.MsgInfo;

/**
 * @program: netty-demo
 * @description: MsgUtil
 * @author: SYH
 * @Create: 2021-11-03 20:46
 **/

public class MsgUtil {

    public static MsgInfo buildMsg(String channelId, String msgContent) {
        return new MsgInfo(channelId,msgContent);
    }

}

