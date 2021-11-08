package top.syhan.chat.protocol.login.dto;

import lombok.Data;

import java.util.Date;
/**
 * @program: chat-server
 * @description: 聊天记录Dto
 * @author: SYH
 * @Create: 2021-11-07 20:14
 **/
@Data
public class ChatRecordDto {

    private String talkId;
    private String userId;
    private String userNickName;
    private String userHead;
    /**
     * 消息类型[0自己/1好友]
     */
    private Integer msgUserType;
    private String msgContent;
    /**
     * 消息类型；0文字消息、1固定表情
     */
    private Integer msgType;
    private Date msgDate;

}
