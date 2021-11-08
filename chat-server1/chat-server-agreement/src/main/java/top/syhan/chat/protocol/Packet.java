package top.syhan.chat.protocol;

import top.syhan.chat.protocol.friend.AddFriendRequest;
import top.syhan.chat.protocol.friend.AddFriendResponse;
import top.syhan.chat.protocol.friend.SearchFriendRequest;
import top.syhan.chat.protocol.friend.SearchFriendResponse;
import top.syhan.chat.protocol.login.LoginRequest;
import top.syhan.chat.protocol.login.LoginResponse;
import top.syhan.chat.protocol.login.ReconnectRequest;
import top.syhan.chat.protocol.msg.MsgGroupRequest;
import top.syhan.chat.protocol.msg.MsgGroupResponse;
import top.syhan.chat.protocol.msg.MsgRequest;
import top.syhan.chat.protocol.msg.MsgResponse;
import top.syhan.chat.protocol.talk.DelTalkRequest;
import top.syhan.chat.protocol.talk.TalkNoticeRequest;
import top.syhan.chat.protocol.talk.TalkNoticeResponse;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: chat-server
 * @description:
 * @author: SYH
 * @Create: 2021-11-06 23:22
 **/
public abstract class Packet {

    private final static Map<Byte, Class<? extends Packet>> PACK_TYPE = new ConcurrentHashMap<>();

    static {
        PACK_TYPE.put(Command.LoginRequest, LoginRequest.class);
        PACK_TYPE.put(Command.LoginResponse, LoginResponse.class);
        PACK_TYPE.put(Command.MsgRequest, MsgRequest.class);
        PACK_TYPE.put(Command.MsgResponse, MsgResponse.class);
        PACK_TYPE.put(Command.TalkNoticeRequest, TalkNoticeRequest.class);
        PACK_TYPE.put(Command.TalkNoticeResponse, TalkNoticeResponse.class);
        PACK_TYPE.put(Command.SearchFriendRequest, SearchFriendRequest.class);
        PACK_TYPE.put(Command.SearchFriendResponse, SearchFriendResponse.class);
        PACK_TYPE.put(Command.AddFriendRequest, AddFriendRequest.class);
        PACK_TYPE.put(Command.AddFriendResponse, AddFriendResponse.class);
        PACK_TYPE.put(Command.DelTalkRequest, DelTalkRequest.class);
        PACK_TYPE.put(Command.MsgGroupRequest, MsgGroupRequest.class);
        PACK_TYPE.put(Command.MsgGroupResponse, MsgGroupResponse.class);
        PACK_TYPE.put(Command.ReconnectRequest, ReconnectRequest.class);
    }

    public static Class<? extends Packet> get(Byte command) {
        return PACK_TYPE.get(command);
    }

    /**
     * 获取协议指令
     *
     * @return 返回指令值
     */
    public abstract Byte getCommand();

}
