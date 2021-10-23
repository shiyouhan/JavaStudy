package top.syhan.chat.ui.view.chat;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

/**
 * @program: chat-ui
 * @description:
 * @author: SYH
 * @Create: 2021-10-22 22:03
 **/
public class ChatEventDefine {

    private ChatInit chatInit;

    public ChatEventDefine(ChatInit chatInit) {
        this.chatInit = chatInit;
        barChat();
        barFriend();
        chatInit.move();
    }



    private void switchBarChat(Button barChat, Pane groupBarChat, boolean toggle) {
        groupBarChat.setVisible(toggle);
    }

    private void switchBarFriend(Button barFriend, Pane groupBarFriend, boolean toggle) {
        groupBarFriend.setVisible(toggle);
    }

    private void barChat() {
        Button barChat = chatInit.$("barChat", Button.class);
        Pane groupBarChat = chatInit.$("groupBarChat", Pane.class);
        barChat.setOnAction(event -> {
                    switchBarChat(barChat, groupBarChat, true);
                    switchBarFriend(chatInit.$("barFriend", Button.class), chatInit.$("groupBarFriend", Pane.class), false);
                }
        );
    }
    private void barFriend() {
        Button barFriend = chatInit.$("barFriend", Button.class);
        Pane groupBarFriend = chatInit.$("groupBarFriend", Pane.class);
        barFriend.setOnAction(event -> {
                    switchBarChat(chatInit.$("barChat", Button.class), chatInit.$("groupBarChat", Pane.class), false);
                    switchBarFriend(barFriend, groupBarFriend, true);
                }
        );
    }
}
