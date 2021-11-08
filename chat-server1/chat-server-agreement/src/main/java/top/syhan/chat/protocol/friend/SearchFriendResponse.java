package top.syhan.chat.protocol.friend;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import top.syhan.chat.protocol.Command;
import top.syhan.chat.protocol.Packet;
import top.syhan.chat.protocol.friend.dto.UserDto;

import java.util.List;

/**
 * @program: chat-server
 * @description: 搜索好友应答
 * @author: SYH
 * @Create: 2021-11-07 20:07
 **/
@Getter
@Setter
@ToString
public class SearchFriendResponse extends Packet {

    private List<UserDto> list;

    @Override
    public Byte getCommand() {
        return Command.SearchFriendResponse;
    }
}
