package top.syhan.chat.protocol.talk;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import top.syhan.chat.protocol.Command;
import top.syhan.chat.protocol.Packet;

/**
 * @program: chat-server
 * @description: 对话通知请求
 * @author: SYH
 * @Create: 2021-11-07 20:25
 **/
@Getter
@Setter
@ToString
public class TalkNoticeRequest extends Packet {

    private String userId;
    private String friendUserId;
    /**
     * 对话框类型[0好友、1群组]
     */
    private Integer talkType;

    public TalkNoticeRequest() {
    }

    public TalkNoticeRequest(String userId, String friendUserId, Integer talkType) {
        this.userId = userId;
        this.friendUserId = friendUserId;
        this.talkType = talkType;
    }

    @Override
    public Byte getCommand() {
        return Command.TalkNoticeRequest;
    }
}
