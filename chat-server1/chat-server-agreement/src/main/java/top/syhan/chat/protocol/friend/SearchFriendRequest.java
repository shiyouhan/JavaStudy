package top.syhan.chat.protocol.friend;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import top.syhan.chat.protocol.Command;
import top.syhan.chat.protocol.Packet;

/**
 * @program: chat-server
 * @description: 搜索好友请求
 * @author: SYH
 * @Create: 2021-11-07 20:06
 **/
@Getter
@Setter
@ToString
public class SearchFriendRequest extends Packet {

    /**
     * 用户ID
     */
    private String userId;
    /**
     * 搜索字段
     */
    private String searchKey;

    public SearchFriendRequest() {
    }

    public SearchFriendRequest(String userId, String searchKey) {
        this.userId = userId;
        this.searchKey = searchKey;
    }


    @Override
    public Byte getCommand() {
        return Command.SearchFriendRequest;
    }

}

