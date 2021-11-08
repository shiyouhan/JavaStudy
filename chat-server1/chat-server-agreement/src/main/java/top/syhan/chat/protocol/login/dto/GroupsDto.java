package top.syhan.chat.protocol.login.dto;

import lombok.Data;

/**
 * @program: chat-server
 * @description: 群组Dto
 * @author: SYH
 * @Create: 2021-11-07 20:16
 **/
@Data
public class GroupsDto {

    private String groupId;
    private String groupName;
    private String groupHead;

}
