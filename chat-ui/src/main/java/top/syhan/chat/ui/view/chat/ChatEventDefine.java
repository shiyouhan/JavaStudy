package top.syhan.chat.ui.view.chat;

import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import top.syhan.chat.ui.view.chat.data.TalkBoxData;
import top.syhan.chat.ui.view.face.FaceController;

import java.util.Date;

/**
 * @program: chat-ui
 * @description:
 * @author: SYH
 * @Create: 2021-10-22 22:03
 **/
public class ChatEventDefine {

    private final ChatInit chatInit;
    private final IChatEvent chatEvent;
    private final IChatMethod chatMethod;

    public ChatEventDefine(ChatInit chatInit, IChatEvent chatEvent, IChatMethod chatMethod) {
        this.chatInit = chatInit;
        this.chatEvent = chatEvent;
        this.chatMethod = chatMethod;

        chatInit.move();     //移动
        min();               // 最小化
        quit();              // 退出
        this.barChat();
        this.barFriend();
        this.barLocation();
        this.barSet();
        doEventTextSend();   // 发送消息事件[键盘]
        doEventTouchSend();  // 发送消息事件[按钮]
        doEventToolFace();   // 表情窗体
    }

    /**
     * 最小化
     */
    private void min() {
        chatInit.$("group_bar_chat_min", Button.class).setOnAction(event -> {
            chatInit.setIconified(true);
        });
        chatInit.$("group_bar_friend_min", Button.class).setOnAction(event -> {
            chatInit.setIconified(true);
        });
    }

    /**
     * 退出
     */
    private void quit() {
        chatInit.$("group_bar_chat_close", Button.class).setOnAction(event -> {
            chatInit.close();
            System.exit(0);
        });
        chatInit.$("group_bar_friend_close", Button.class).setOnAction(event -> {
            chatInit.close();
            System.exit(0);
        });
    }

    private void switchBarChat(Button barChat, Pane groupBarChat, boolean toggle) {
        if (toggle) {
            groupBarChat.setVisible(true);
            barChat.getGraphic().setStyle("-fx-icon-color:'#9E99EE'");
        } else {
            groupBarChat.setVisible(false);
            barChat.getGraphic().setStyle("-fx-icon-color:'#6F6F70'");
        }
    }

    private void switchBarFriend(Button barFriend, Pane groupBarFriend, boolean toggle) {
        if (toggle) {
            groupBarFriend.setVisible(true);
            barFriend.getGraphic().setStyle("-fx-icon-color:'#9E99EE'");
        } else {
            groupBarFriend.setVisible(false);
            barFriend.getGraphic().setStyle("-fx-icon-color:'#6F6F70'");

        }
    }

    private void switchBarLocation(Button barLocation, Pane groupBarLocation, boolean toggle) {
        if (toggle) {
            groupBarLocation.setVisible(true);
            barLocation.getGraphic().setStyle("-fx-icon-color:'#9E99EE'");
        } else {
            groupBarLocation.setVisible(false);
            barLocation.getGraphic().setStyle("-fx-icon-color:'#6F6F70'");
        }
    }

    private void switchBarSet(Button barSet, Pane groupBarSet, boolean toggle) {
        if (toggle) {
            groupBarSet.setVisible(true);
            barSet.getGraphic().setStyle("-fx-icon-color:'#9E99EE'");
        } else {
            groupBarSet.setVisible(false);
            barSet.getGraphic().setStyle("-fx-icon-color:'#6F6F70'");
        }
    }

    private void barChat() {
        Button barChat = chatInit.$("barChat", Button.class);
        Pane groupBarChat = chatInit.$("groupBarChat", Pane.class);
        barChat.setOnAction(event -> {
            switchBarChat(barChat, groupBarChat, true);
            switchBarFriend(chatInit.$("barFriend", Button.class), chatInit.$("groupBarFriend", Pane.class), false);
            switchBarLocation(chatInit.$("barLocation", Button.class), chatInit.$("groupBarLocation", Pane.class), false);
            switchBarSet(chatInit.$("barSet", Button.class), chatInit.$("groupBarSet", Pane.class), false);
        });

        barChat.setOnMouseEntered(event -> {
            boolean visible = groupBarChat.isVisible();
            if (visible) {
                return;
            }
            barChat.getGraphic().setStyle("-fx-icon-color:'#F6F6F6'");
        });
        barChat.setOnMouseExited(event -> {
            boolean visible = groupBarChat.isVisible();
            if (visible) {
                return;
            }
            barChat.getGraphic().setStyle("-fx-icon-color:'#6F6F70'");
        });
    }

    private void barFriend() {
        Button barFriend = chatInit.$("barFriend", Button.class);
        Pane groupBarFriend = chatInit.$("groupBarFriend", Pane.class);
        barFriend.setOnAction(event -> {
                    switchBarChat(chatInit.$("barChat", Button.class), chatInit.$("groupBarChat", Pane.class), false);
                    switchBarFriend(barFriend, groupBarFriend, true);
                    switchBarLocation(chatInit.$("barLocation", Button.class), chatInit.$("groupBarLocation", Pane.class), false);
                    switchBarSet(chatInit.$("barSet", Button.class), chatInit.$("groupBarSet", Pane.class), false);
                }
        );
        barFriend.setOnMouseEntered(event -> {
            boolean visible = groupBarFriend.isVisible();
            if (visible) {
                return;
            }
            barFriend.getGraphic().setStyle("-fx-icon-color:'#F6F6F6'");
        });
        barFriend.setOnMouseExited(event -> {
            boolean visible = groupBarFriend.isVisible();
            if (visible) {
                return;
            }
            barFriend.getGraphic().setStyle("-fx-icon-color:'#6F6F70'");
        });
    }

    private void barLocation() {
        Button barLocation = chatInit.$("barLocation", Button.class);
        Pane groupBarLocation = chatInit.$("groupBarLocation", Pane.class);
        barLocation.setOnAction(event -> {
                    switchBarChat(chatInit.$("barLocation", Button.class), chatInit.$("groupBarLocation", Pane.class), false);
                    switchBarFriend(chatInit.$("barFriend", Button.class), chatInit.$("groupBarFriend", Pane.class), false);
                    switchBarLocation(barLocation, groupBarLocation, true);
                    switchBarSet(chatInit.$("barSet", Button.class), chatInit.$("groupBarSet", Pane.class), false);
                }
        );
        barLocation.setOnMouseEntered(event -> {
            boolean visible = groupBarLocation.isVisible();
            if (visible) {
                return;
            }
            barLocation.getGraphic().setStyle("-fx-icon-color:'#F6F6F6'");
        });
        barLocation.setOnMouseExited(event -> {
            boolean visible = groupBarLocation.isVisible();
            if (visible) {
                return;
            }
            barLocation.getGraphic().setStyle("-fx-icon-color:'#6F6F70'");
        });
    }

    private void barSet() {
        Button barSet = chatInit.$("barSet", Button.class);
        Pane groupBarSet = chatInit.$("groupBarSet", Pane.class);
        barSet.setOnAction(event -> {
                    switchBarChat(chatInit.$("barLocation", Button.class), chatInit.$("groupBarLocation", Pane.class), false);
                    switchBarFriend(chatInit.$("barFriend", Button.class), chatInit.$("groupBarFriend", Pane.class), false);
                    switchBarLocation(chatInit.$("barLocation", Button.class), chatInit.$("groupBarLocation", Pane.class), false);
                    switchBarSet(barSet, groupBarSet, true);
                }
        );
        barSet.setOnMouseEntered(event -> {
            boolean visible = groupBarSet.isVisible();
            if (visible) {
                return;
            }
            barSet.getGraphic().setStyle("-fx-icon-color:'#F6F6F6'");
        });
        barSet.setOnMouseExited(event -> {
            boolean visible = groupBarSet.isVisible();
            if (visible) {
                return;
            }
            barSet.getGraphic().setStyle("-fx-icon-color:'#6F6F70'");
        });
    }

    /**
     * 发送消息[按钮]
     */
    private void doEventTouchSend() {
        Label touchSend = chatInit.$("touch_send", Label.class);
        touchSend.setOnMousePressed(event -> {
            doEventSendMsg();
        });
    }


    /**
     * 发送消息快捷键
     */
    private void doEventTextSend() {
        TextArea txtInput = chatInit.$("txt_input", TextArea.class);
        txtInput.setOnKeyPressed(event -> {
            if (event.getCode().equals(KeyCode.ENTER)) {
                doEventSendMsg();
            }
        });
    }

    private void doEventSendMsg() {
        TextArea txtInput = chatInit.$("txt_input", TextArea.class);
        MultipleSelectionModel selectionModel = chatInit.$("talkList", ListView.class).getSelectionModel();
        Pane selectedItem = (Pane) selectionModel.getSelectedItem();
        // 对话信息
        TalkBoxData talkBoxData = (TalkBoxData) selectedItem.getUserData();
        String msg = txtInput.getText().trim();
        if ("".equals(msg)) {
            return;
        }
        // 发送消息
        System.out.println("发送消息：" + msg);
        // 发送事件给自己添加消息
        chatMethod.addTalkMsgRight(talkBoxData.getTalkId(), msg, new Date(), true, true, false);
        txtInput.clear();
    }


    /**
     * 与好友发送消息 [点击发送消息时候触发 -> 添加到对话框、选中、展示对话列表]
     *
     * @param sendMsgButton      发送按钮
     * @param userFriendId       好友id
     * @param userFriendNickName 好友昵称
     * @param userFriendHead     好友头像
     */
    public void doEventOpenFriendUserSendMsg(Button sendMsgButton, String userFriendId, String userFriendNickName, String userFriendHead) {
        sendMsgButton.setOnAction(event -> {
            // 1. 添加好友到对话框
            chatMethod.addTalkBox(0, 0, userFriendId, userFriendNickName, userFriendHead, null, null, true);
            System.out.println(userFriendId + "," + userFriendNickName);
            // 2. 切换到对话框窗口
            switchBarChat(chatInit.$("barChat", Button.class), chatInit.$("groupBarChat", Pane.class), true);
            switchBarFriend(chatInit.$("barFriend", Button.class), chatInit.$("groupBarFriend", Pane.class), false);
            // 3. 事件处理；填充到对话框
            System.out.println("事件处理；填充到对话框");
        });
    }

    /**
     * 群组发送消息
     *
     * @param sendMsgButton 发送按钮
     * @param groupId       群组id
     * @param groupName     群组名称
     * @param groupHead     群头像
     */
    public void doEventOpenFriendGroupSendMsg(Button sendMsgButton, String groupId, String groupName, String groupHead) {
        sendMsgButton.setOnAction(event -> {
            // 1. 添加群组到对话框
            chatMethod.addTalkBox(0, 1, groupId, groupName, groupHead, null, null, true);
            // 2. 切换到对话框窗口
            switchBarChat(chatInit.$("barChat", Button.class), chatInit.$("groupBarChat", Pane.class), true);
            switchBarFriend(chatInit.$("barFriend", Button.class), chatInit.$("groupBarFriend", Pane.class), false);
            // 3. 事件处理；填充到对话框
            System.out.println("事件处理；填充到对话框");
        });
    }


    /**
     * 表情事件
     */
    private void doEventToolFace() {
        FaceController face = new FaceController(chatInit, chatInit, chatEvent, chatMethod);
        Button tool_face = chatInit.$("tool_face", Button.class);
        tool_face.setOnMousePressed(event -> {
            face.doShowFace(chatMethod.getToolFaceX(), chatMethod.getToolFaceY());
        });
    }

}
