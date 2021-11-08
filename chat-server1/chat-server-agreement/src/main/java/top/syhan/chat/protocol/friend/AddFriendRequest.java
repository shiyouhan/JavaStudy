package top.syhan.chat.protocol.friend;

import top.syhan.chat.protocol.Command;
import top.syhan.chat.protocol.Packet;

/**
 * @program: chat-server
 * @description: 添加好友请求
 * @author: SYH
 * @Create: 2021-11-07 20:03
 **/
public class AddFriendRequest extends Packet {

    /**
     * 用户ID[自己的ID]
     */
    private String userId;
    /**
     * 好友ID
     */
    private String friendId;

    public AddFriendRequest() {
    }

    public AddFriendRequest(String userId, String friendId) {
        this.userId = userId;
        this.friendId = friendId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFriendId() {
        return friendId;
    }

    public void setFriendId(String friendId) {
        this.friendId = friendId;
    }

    @Override
    public Byte getCommand() {
        return Command.AddFriendRequest;
    }

}

