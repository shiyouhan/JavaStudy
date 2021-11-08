package top.syhan.chat.protocol.login.dto;

import lombok.Data;

/**
 * @program: chat-server
 * @description: 用户好友Dto
 * @author: SYH
 * @Create: 2021-11-07 20:16
 **/
@Data
public class UserFriendDto {

    private String friendId;
    private String friendName;
    private String friendHead;

}
