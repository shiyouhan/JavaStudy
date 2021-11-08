package top.syhan.chat.protocol.login;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import top.syhan.chat.protocol.Command;
import top.syhan.chat.protocol.Packet;

/**
 * @program: chat-server
 * @description: 登录请求
 * @author: SYH
 * @Create: 2021-11-07 20:10
 **/
@Getter
@Setter
@ToString
public class LoginRequest extends Packet {

    private String userId;
    private String userPassword;

    public LoginRequest(String userId, String userPassword) {
        this.userId = userId;
        this.userPassword = userPassword;
    }


    @Override
    public Byte getCommand() {
        return Command.LoginRequest;
    }

}
