package top.syhan.chat.ui;

import javafx.application.Application;
import javafx.stage.Stage;
import top.syhan.chat.ui.view.chat.ChatController;
import top.syhan.chat.ui.view.chat.IChatMethod;
import top.syhan.chat.ui.view.login.ILoginMethod;
import top.syhan.chat.ui.view.login.LoginController;

import java.io.IOException;

/**
 * @program: chat-ui
 * @description:
 * @author: SYH
 * @Create: 2021-10-21 23:44
 **/
public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        IChatMethod chat = new ChatController();
        chat.doShow();
    }

    public static void main(String[] args) {
        launch(args);
    }

//    @Override
//    public void start(Stage stage) throws IOException {
//        ILoginMethod login = new LoginController((userId, userPassword) -> {
//            System.out.println("登陆 userId：" + userId + "userPassword：" + userPassword);
//        });
//
//        login.doShow();
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }

//    @Override
//    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("view/login/login.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 540, 420);
//        stage.setTitle("Login");
//        stage.setScene(scene);
//        stage.initStyle(StageStyle.TRANSPARENT);
//        stage.show();
//    }
//
//    public static void main(String[] args) {
//        launch();
//    }

}
