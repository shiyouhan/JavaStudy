package top.syhan.chat.protocol.friend.dto;

import lombok.Data;

/**
 * @program: chat-server
 * @description: UserDto
 * @author: SYH
 * @Create: 2021-11-07 20:08
 **/
@Data
public class UserDto {

    private String userId;
    private String userNickName;
    private String userHead;
    private Integer status;

    public UserDto() {
    }

    public UserDto(String userId, String userNickName, String userHead) {
        this.userId = userId;
        this.userNickName = userNickName;
        this.userHead = userHead;
    }

}
