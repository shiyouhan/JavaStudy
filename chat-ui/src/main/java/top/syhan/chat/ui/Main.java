package top.syhan.chat.ui;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import top.syhan.chat.ui.view.chat.ChatController;
import top.syhan.chat.ui.view.chat.IChatMethod;
import top.syhan.chat.ui.view.login.ILoginMethod;
import top.syhan.chat.ui.view.login.LoginController;

import java.io.IOException;
import java.util.Date;

/**
 * @program: chat-ui
 * @description:
 * @author: SYH
 * @Create: 2021-10-21 23:44
 **/
public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        ILoginMethod login = new LoginController((userId, userPassword) -> {
            if ("syhan".equals(userId) && "123".equals(userPassword)) {
                //登录成功，弹出窗口
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.titleProperty().set("提示");
                alert.headerTextProperty().set("登录成功！");
                alert.showAndWait();
                IChatMethod chat = new ChatController();
                chat.doShow();
                 //填充对话框测试数据
                chat.addTalkBox(-1, 0, "1000001", "一号床", "https://tva3.sinaimg.cn/large/9bd9b167ly1g1p9q1ufe2j20b40b4mxr.jpg", "(ง •̀_•́)ง", new Date(), true);
                chat.addTalkBox(-1, 0, "1000002", "二号床", "https://tva3.sinaimg.cn/large/9bd9b167ly1fzjvsomfksj20b40b4aap.jpg", "(ΘェΘ)", new Date(), true);
                chat.addTalkBox(-1, 0, "1000003", "三号床", "https://tva4.sinaimg.cn/large/9bd9b167ly1fzjwiy6180j20b40b4zkn.jpg", "(￢_￢)", new Date(), false);
                chat.addTalkBox(-1, 0, "1000004", "四号床", "https://tva4.sinaimg.cn/large/9bd9b167ly1g1p9ptiip4j20b40b4aak.jpg", "(눈_눈)", new Date(), false);
                chat.addTalkBox(-1, 0, "1000005", "五号床", "https://tva4.sinaimg.cn/large/9bd9b167gy1fzjvs8min4j20b40b4q3g.jpg", "(•‾̑⌣‾̑•)", new Date(), false);
                chat.addTalkBox(-1, 0, "1000006", "六号床", "https://tva4.sinaimg.cn/large/9bd9b167ly1g1p9pt3g1jj20b40b40t8.jpg", "(*｡_｡)", new Date(), false);
                chat.addTalkBox(0, 1, "5307397", "筠竹苑的小树林", "https://tva4.sinaimg.cn/large/9bd9b167ly1g1p9qmx8p1j20b40b40u3.jpg", "小树林里的卧龙凤雏", new Date(), false);
            }
            else {
                //弹出窗口，提示登录失败
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.titleProperty().set("提示");
                alert.headerTextProperty().set("登录失败！");
            }
        });
        login.doShow();
    }
    public static void main(String[] args) {
        launch(args);
    }

//    @Override
//    public void start(Stage stage) throws IOException {
//        IChatMethod chat = new ChatController();
//        chat.doShow();
//        // 填充对话框测试数据
//        chat.addTalkBox(-1, 0, "1000001", "一号床", "https://tva3.sinaimg.cn/large/9bd9b167ly1g1p9q1ufe2j20b40b4mxr.jpg", "(ง •̀_•́)ง", new Date(), true);
//        chat.addTalkBox(-1, 0, "1000002", "二号床", "https://tva3.sinaimg.cn/large/9bd9b167ly1fzjvsomfksj20b40b4aap.jpg", "(ΘェΘ)", new Date(), true);
//        chat.addTalkBox(-1, 0, "1000003", "三号床", "https://tva4.sinaimg.cn/large/9bd9b167ly1fzjwiy6180j20b40b4zkn.jpg", "(￢_￢)", new Date(), false);
//        chat.addTalkBox(-1, 0, "1000004", "四号床", "https://tva4.sinaimg.cn/large/9bd9b167ly1g1p9ptiip4j20b40b4aak.jpg", "(눈_눈)", new Date(), false);
//        chat.addTalkBox(-1, 0, "1000005", "五号床", "https://tva4.sinaimg.cn/large/9bd9b167gy1fzjvs8min4j20b40b4q3g.jpg", "(•‾̑⌣‾̑•)", new Date(), false);
//        chat.addTalkBox(-1, 0, "1000006", "六号床", "https://tva4.sinaimg.cn/large/9bd9b167ly1g1p9pt3g1jj20b40b40t8.jpg", "(*｡_｡)", new Date(), false);
//        chat.addTalkBox(0, 1, "5307397", "筠竹苑的小树林", "https://tva4.sinaimg.cn/large/9bd9b167ly1g1p9qmx8p1j20b40b40u3.jpg", "小树林里的卧龙凤雏", new Date(), false);
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }

//    @Override
//    public void start(Stage stage) throws IOException {
//        IChatMethod chat = new ChatController();
//        chat.doShow();
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }

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
