package top.syhan.chat.ui.view.chat;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;
import top.syhan.chat.ui.Main;
import top.syhan.chat.ui.UIObject;

import java.io.IOException;
import java.util.Objects;

/**
 * @program: chat-ui
 * @description: 窗体的初始化操作
 * @author: SYH
 * @Create: 2021-10-22 22:03
 **/

public abstract class ChatInit extends UIObject {

    private static final String RESOURCE_NAME = "view/chat/chat.fxml";

    /**
     * 用户ID
     */
    public String userId;
    /**
     * 用户昵称
     */
    public String userNickName;
    /**
     * 用户头像
     */
    public String userHead;

    public IChatEvent chatEvent;

    /**
     * 输入框
     */
    public TextArea txtInput;

    ChatInit(IChatEvent chatEvent) {
        this.chatEvent = chatEvent;
        try {
            root = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource(RESOURCE_NAME)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root, 1243, 820);
        scene.setFill(Color.TRANSPARENT);
        setScene(scene);
        initStyle(StageStyle.TRANSPARENT);
        setResizable(false);
        //this.getIcons().add(new Image(Objects.requireNonNull(Main.class.getResourceAsStream("view/chat/img/head/logo.png"))));
        obtain();
        initView();
        initEventDefine();
    }

    private void obtain() {
        // 可以预加载
        txtInput = $("txt_input", TextArea.class);
    }

//    private static final String RESOURCE_NAME = "view/chat/chat.fxml";
//
//    ChatInit() {
//        try {
//            root = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource(RESOURCE_NAME)));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        Scene scene = new Scene(root,980,720);
//        scene.setFill(Color.TRANSPARENT);
//        setScene(scene);
//        initStyle(StageStyle.TRANSPARENT);
//        setResizable(false);
//        this.getIcons().add(new Image(Objects.requireNonNull(Main.class.getResourceAsStream("view/chat/img/head/logo.png"))));
//        initView();
//        initEventDefine();
//    }
}
