package top.syhan.chat.protocol.login.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @program: chat-server
 * @description: 网络数据传输对象：聊天对话框
 * @author: SYH
 * @Create: 2021-11-07 20:15
 **/
@Data
public class ChatTalkDto {
    /**
     * 对话框ID
     */
    private String talkId;
    /**
     * 对话框类型；0好友、1群组
     */
    private Integer talkType;
    private String talkName;
    private String talkHead;
    /**
     * 消息简述
     */
    private String talkSketch;
    private Date talkDate;

    /**
     * 聊天记录
     */
    private List<ChatRecordDto> chatRecordList;

}
