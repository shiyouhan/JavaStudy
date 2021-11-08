package top.syhan.chat.protocol.login;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import top.syhan.chat.protocol.Command;
import top.syhan.chat.protocol.Packet;
import top.syhan.chat.protocol.login.dto.ChatTalkDto;
import top.syhan.chat.protocol.login.dto.GroupsDto;
import top.syhan.chat.protocol.login.dto.UserFriendDto;

import java.util.ArrayList;
import java.util.List;


/**
 * @program: chat-server
 * @description: 登录响应
 * @author: SYH
 * @Create: 2021-11-07 20:10
 **/
@Getter
@Setter
@ToString
public class LoginResponse extends Packet {
    /**
     * 登陆反馈
     */
    private boolean success;
    private String userId;
    private String userHead;
    private String userNickName;
    /**
     * 聊天对话框数据[success is true]
     */
    private List<ChatTalkDto> chatTalkList = new ArrayList<>();
    /**
     * 群组列表
     */
    private List<GroupsDto> groupsList = new ArrayList<>();
    /**
     * 好友列表
     */
    private List<UserFriendDto> userFriendList = new ArrayList<>();

    public LoginResponse() {
    }

    public LoginResponse(boolean success) {
        this.success = success;
    }


    @Override
    public Byte getCommand() {
        return Command.LoginResponse;
    }

}

