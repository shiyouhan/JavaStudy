package top.syhan.chat.ui;

import javafx.application.Application;
import javafx.stage.Stage;
import top.syhan.chat.ui.view.chat.ChatController;
import top.syhan.chat.ui.view.chat.IChatEvent;
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
        ILoginMethod login = new LoginController((userId, userPassword, loginController) -> {
            if ("syhan".equals(userId) && "123".equals(userPassword)) {
                loginController.doLoginSuccess();
                IChatMethod chat = new ChatController(new IChatEvent() {
                });
                chat.doShow();
                chat.setUserInfo("1000001", "syhan", "https://tva3.sinaimg.cn/large/9bd9b167gy1g1p9vosmtjj20b40b4t91.jpg");

                chat.addTalkBox(-1, 0, "1000003", "吕绍君", "https://tva4.sinaimg.cn/large/9bd9b167ly1fzjwiy6180j20b40b4zkn.jpg", "", new Date(), false);
                chat.addTalkMsgRight("1000003", "你哪位?", new Date(), true, false, false);
                chat.addTalkMsgUserLeft("1000003", "我是三号床", new Date(), true, false, true);
//                chat.addTalkMsgUserLeft("1000003", "自傲，清高，闷骚，也属于这个群体鲜明标签。", new Date(), true, true, true);

                chat.addTalkBox(-1, 0, "1000004", "范冰戈", "https://tva4.sinaimg.cn/large/9bd9b167ly1g1p9ptiip4j20b40b4aak.jpg", "", new Date(), false);
                chat.addTalkMsgRight("1000004", "你哪位?", new Date(), true, false, false);
                chat.addTalkMsgUserLeft("1000004", "我是四号床", new Date(), true, true, true);
//                chat.addTalkMsgUserLeft("1000004", "唯一不变的，是人与人之间的江湖", new Date(), true, false, true);


                chat.addTalkBox(-1, 0, "1000005", "施友涵", "https://tva4.sinaimg.cn/large/9bd9b167gy1fzjvs8min4j20b40b4q3g.jpg", "", new Date(), false);
                chat.addTalkMsgRight("1000005", "你哪位?", new Date(), true, false, false);
                chat.addTalkMsgUserLeft("1000005", "我是五号床", new Date(), true, true, true);
//                chat.addTalkMsgUserLeft("1000005", "唯一不变的，是人与人之间的江湖", new Date(), true, false, true);

                chat.addTalkBox(-1, 0, "1000006", "王林", "https://tva4.sinaimg.cn/large/9bd9b167ly1g1p9pt3g1jj20b40b40t8.jpg", "", new Date(), false);
                chat.addTalkMsgRight("1000006", "你哪位?", new Date(), true, false, false);
                chat.addTalkMsgUserLeft("1000006", "我是六号床", new Date(), true, true, true);
//                chat.addTalkMsgUserLeft("1000006", "唯一不变的，是人与人之间的江湖", new Date(), true, false, true);

                chat.addTalkBox(-1, 0, "1000007", "陶然然", "https://t.ly/HEjv", "", new Date(), false);
                chat.addTalkMsgRight("1000007", "老師好", new Date(), true, false, false);
                chat.addTalkMsgUserLeft("1000007", "Hi,nice to meet you.", new Date(), true, true, false);

        // 群组
        chat.addFriendGroup("2000001", "筠竹苑的小树林", "https://tva4.sinaimg.cn/large/9bd9b167ly1g1p9qmx8p1j20b40b40u3.jpg");
//        chat.addFriendGroup("2000002", "达摩院", "https://niit-soft.oss-cn-hangzhou.aliyuncs.com/avatar/hand-2.jpg");

        // 群组 - 对话框
        chat.addTalkBox(0, 1, "5307397", "筠竹苑的小树林", "https://tva4.sinaimg.cn/large/9bd9b167ly1g1p9qmx8p1j20b40b40u3.jpg", "", new Date(), false);
        chat.addTalkMsgRight("5307397", "小树林里的卧龙凤雏", new Date(), true, true, false);
        chat.addTalkMsgGroupLeft("5307397", "1000002", "卧龙", "https://tva4.sinaimg.cn/large/9bd9b167ly1fzjwiy6180j20b40b4zkn.jpg", "得一安天下", new Date(), true, false, true);
        chat.addTalkMsgGroupLeft("5307397", "1000003", "凤雏", "https://tva4.sinaimg.cn/large/9bd9b167ly1g1p9pt3g1jj20b40b40t8.jpg", "得一安天下", new Date(), true, false, true);

        // 好友
//        chat.addFriendUser(false, "1000002", "陈蓉琪", "https://tva4.sinaimg.cn/large/9bd9b167ly1fzjwiy6180j20b40b4zkn.jpg");
        chat.addFriendUser(false, "1000003", "卧龙", "https://tva4.sinaimg.cn/large/9bd9b167ly1fzjwiy6180j20b40b4zkn.jpg");
        chat.addFriendUser(false, "1000004", "凤雏", "https://tva4.sinaimg.cn/large/9bd9b167ly1g1p9pt3g1jj20b40b40t8.jpg");
//        chat.addFriendUser(false, "1000005", "王林", "https://tva4.sinaimg.cn/large/9bd9b167gy1fzjvs8min4j20b40b4q3g.jpg");

            }
            else {
                loginController.doLoginError();
            }
        });
        login.doShow();
    }
//        IChatMethod chat = new ChatController(new IChatEvent() {
//        });
//
//        chat.doShow();
//        // 用户信息
//        chat.setUserInfo("1000001", "syhan", "https://tva3.sinaimg.cn/large/9bd9b167gy1g1p9vosmtjj20b40b4t91.jpg");
//
//                chat.addTalkBox(-1, 0, "1000003", "吕绍君", "https://tva4.sinaimg.cn/large/9bd9b167ly1fzjwiy6180j20b40b4zkn.jpg", "", new Date(), false);
//                chat.addTalkMsgRight("1000003", "你哪位?", new Date(), true, false, false);
//                chat.addTalkMsgUserLeft("1000003", "我是三号床", new Date(), true, false, true);
////                chat.addTalkMsgUserLeft("1000003", "自傲，清高，闷骚，也属于这个群体鲜明标签。", new Date(), true, true, true);
//
//                chat.addTalkBox(-1, 0, "1000004", "范冰戈", "https://tva4.sinaimg.cn/large/9bd9b167ly1g1p9ptiip4j20b40b4aak.jpg", "", new Date(), false);
//                chat.addTalkMsgRight("1000004", "你哪位?", new Date(), true, false, false);
//                chat.addTalkMsgUserLeft("1000004", "我是四号床", new Date(), true, true, true);
////                chat.addTalkMsgUserLeft("1000004", "唯一不变的，是人与人之间的江湖", new Date(), true, false, true);
//
//
//                chat.addTalkBox(-1, 0, "1000005", "施友涵", "https://tva4.sinaimg.cn/large/9bd9b167gy1fzjvs8min4j20b40b4q3g.jpg", "", new Date(), false);
//                chat.addTalkMsgRight("1000005", "你哪位?", new Date(), true, false, false);
//                chat.addTalkMsgUserLeft("1000005", "我是五号床", new Date(), true, true, true);
////                chat.addTalkMsgUserLeft("1000005", "唯一不变的，是人与人之间的江湖", new Date(), true, false, true);
//
//                chat.addTalkBox(-1, 0, "1000006", "王林", "https://tva4.sinaimg.cn/large/9bd9b167ly1g1p9pt3g1jj20b40b40t8.jpg", "", new Date(), false);
//                chat.addTalkMsgRight("1000006", "你哪位?", new Date(), true, false, false);
//                chat.addTalkMsgUserLeft("1000006", "我是六号床", new Date(), true, true, true);
////                chat.addTalkMsgUserLeft("1000006", "唯一不变的，是人与人之间的江湖", new Date(), true, false, true);
//
//                chat.addTalkBox(-1, 0, "1000007", "陶然然", "https://t.ly/HEjv", "", new Date(), false);
//                chat.addTalkMsgRight("1000007", "老師好", new Date(), true, false, false);
//                chat.addTalkMsgUserLeft("1000007", "Hi,nice to meet you.", new Date(), true, true, false);
//
//        // 群组
//        chat.addFriendGroup("2000001", "筠竹苑的小树林", "https://tva4.sinaimg.cn/large/9bd9b167ly1g1p9qmx8p1j20b40b40u3.jpg");
////        chat.addFriendGroup("2000002", "达摩院", "https://niit-soft.oss-cn-hangzhou.aliyuncs.com/avatar/hand-2.jpg");
//
//        // 群组 - 对话框
//        chat.addTalkBox(0, 1, "5307397", "筠竹苑的小树林", "https://tva4.sinaimg.cn/large/9bd9b167ly1g1p9qmx8p1j20b40b40u3.jpg", "", new Date(), false);
//        chat.addTalkMsgRight("5307397", "小树林里的卧龙凤雏", new Date(), true, true, false);
//        chat.addTalkMsgGroupLeft("5307397", "1000002", "卧龙", "https://tva4.sinaimg.cn/large/9bd9b167ly1fzjwiy6180j20b40b4zkn.jpg", "得一安天下", new Date(), true, false, true);
//        chat.addTalkMsgGroupLeft("5307397", "1000003", "凤雏", "https://tva4.sinaimg.cn/large/9bd9b167ly1g1p9pt3g1jj20b40b40t8.jpg", "得一安天下", new Date(), true, false, true);
//
//        // 好友
////        chat.addFriendUser(false, "1000002", "陈蓉琪", "https://tva4.sinaimg.cn/large/9bd9b167ly1fzjwiy6180j20b40b4zkn.jpg");
//        chat.addFriendUser(false, "1000003", "卧龙", "https://tva4.sinaimg.cn/large/9bd9b167ly1fzjwiy6180j20b40b4zkn.jpg");
//        chat.addFriendUser(false, "1000004", "凤雏", "https://tva4.sinaimg.cn/large/9bd9b167ly1g1p9pt3g1jj20b40b40t8.jpg");
////        chat.addFriendUser(false, "1000005", "王林", "https://tva4.sinaimg.cn/large/9bd9b167gy1fzjvs8min4j20b40b4q3g.jpg");



    public static void main(String[] args) {
        launch(args);
    }

//    @Override
//    public void start(Stage stage) throws IOException {
//        ILoginMethod login = new LoginController((userId, userPassword, loginController) -> {
//            if ("syhan".equals(userId) && "123".equals(userPassword)) {
//                loginController.doLoginSuccess();
//                IChatMethod chat = new ChatController(new IChatEvent() {
//                });
//                chat.doShow();
//                chat.setUserInfo("1000001", "syhan", "https://tva3.sinaimg.cn/large/9bd9b167gy1g1p9vosmtjj20b40b4t91.jpg");
//
//                // 好友 - 对话框
//                chat.addTalkBox(-1, 0, "1000001", "孙習焱", "https://tva3.sinaimg.cn/large/9bd9b167ly1g1p9q1ufe2j20b40b4mxr.jpg", "", new Date(), false);
//                chat.addTalkMsgRight("1000001", "你哪位?", new Date(), true, true, false);
//                chat.addTalkMsgUserLeft("1000001", "我是一号床", new Date(), true, false, true);
//
//                chat.addTalkBox(-1, 0, "1000002", "彭海洋", "https://tva3.sinaimg.cn/large/9bd9b167ly1fzjvsomfksj20b40b4aap.jpg", "", new Date(), false);
//                chat.addTalkMsgRight("1000002", "你哪位?", new Date(), true, false, false);
//                chat.addTalkMsgUserLeft("1000002", "我是二号床", new Date(), true, true, true);
////                chat.addTalkMsgUserLeft("1000002", "你所了解的网络往往也是冰山一角", new Date(), true, false, true);
//
//                chat.addTalkBox(-1, 0, "1000003", "吕绍君", "https://tva4.sinaimg.cn/large/9bd9b167ly1fzjwiy6180j20b40b4zkn.jpg", "", new Date(), false);
//                chat.addTalkMsgRight("1000003", "你哪位?", new Date(), true, false, false);
//                chat.addTalkMsgUserLeft("1000003", "我是三号床", new Date(), true, false, true);
////                chat.addTalkMsgUserLeft("1000003", "自傲，清高，闷骚，也属于这个群体鲜明标签。", new Date(), true, true, true);
//
//                chat.addTalkBox(-1, 0, "1000004", "范冰戈", "https://tva4.sinaimg.cn/large/9bd9b167ly1g1p9ptiip4j20b40b4aak.jpg", "", new Date(), false);
//                chat.addTalkMsgRight("1000004", "你哪位?", new Date(), true, false, false);
//                chat.addTalkMsgUserLeft("1000004", "我是四号床", new Date(), true, true, true);
////                chat.addTalkMsgUserLeft("1000004", "唯一不变的，是人与人之间的江湖", new Date(), true, false, true);
//
//
//                chat.addTalkBox(-1, 0, "1000005", "施友涵", "https://tva4.sinaimg.cn/large/9bd9b167gy1fzjvs8min4j20b40b4q3g.jpg", "", new Date(), false);
//                chat.addTalkMsgRight("1000005", "你哪位?", new Date(), true, false, false);
//                chat.addTalkMsgUserLeft("1000005", "我是五号床", new Date(), true, true, true);
////                chat.addTalkMsgUserLeft("1000005", "唯一不变的，是人与人之间的江湖", new Date(), true, false, true);
//
//                chat.addTalkBox(-1, 0, "1000006", "王林", "https://tva4.sinaimg.cn/large/9bd9b167ly1g1p9pt3g1jj20b40b40t8.jpg", "", new Date(), false);
//                chat.addTalkMsgRight("1000006", "你哪位?", new Date(), true, false, false);
//                chat.addTalkMsgUserLeft("1000006", "我是六号床", new Date(), true, true, true);
////                chat.addTalkMsgUserLeft("1000006", "唯一不变的，是人与人之间的江湖", new Date(), true, false, true);
//
//                chat.addTalkBox(-1, 0, "1000007", "陶然然", "https://t.ly/HEjv", "", new Date(), false);
//                chat.addTalkMsgRight("1000007", "老師好", new Date(), true, false, false);
//                chat.addTalkMsgUserLeft("1000007", "Hi,nice to meet you.", new Date(), true, true, false);
//                // 群组 - 对话框
////                chat.addTalkBox(0, 1, "5307397", "陶然然", "https://tva4.sinaimg.cn/large/9bd9b167ly1g1p9qmx8p1j20b40b40u3.jpg", "", new Date(), true);
////                chat.addTalkMsgRight("5307397", "小树林里的卧龙凤雏", new Date(), true, true, false);
////                chat.addTalkMsgGroupLeft("5307397", "1000002", "彭海洋", "https://tva3.sinaimg.cn/large/9bd9b167ly1fzjvsomfksj20b40b4aap.jpg", "我是卧龙", new Date(), true, false, true);
////                chat.addTalkMsgGroupLeft("5307397", "1000006", "王林", "https://tva4.sinaimg.cn/large/9bd9b167ly1g1p9pt3g1jj20b40b40t8.jpg", "我是凤雏", new Date(), true, false, true);
////                 //填充对话框测试数据
////                chat.addTalkBox(-1, 0, "1000001", "一号床", "https://tva3.sinaimg.cn/large/9bd9b167ly1g1p9q1ufe2j20b40b4mxr.jpg", "(ง •̀_•́)ง", new Date(), true);
////                chat.addTalkBox(-1, 0, "1000002", "二号床", "https://tva3.sinaimg.cn/large/9bd9b167ly1fzjvsomfksj20b40b4aap.jpg", "(ΘェΘ)", new Date(), true);
////                chat.addTalkBox(-1, 0, "1000003", "三号床", "https://tva4.sinaimg.cn/large/9bd9b167ly1fzjwiy6180j20b40b4zkn.jpg", "(￢_￢)", new Date(), false);
////                chat.addTalkBox(-1, 0, "1000004", "四号床", "https://tva4.sinaimg.cn/large/9bd9b167ly1g1p9ptiip4j20b40b4aak.jpg", "(눈_눈)", new Date(), false);
////                chat.addTalkBox(-1, 0, "1000005", "五号床", "https://tva4.sinaimg.cn/large/9bd9b167gy1fzjvs8min4j20b40b4q3g.jpg", "(•‾̑⌣‾̑•)", new Date(), false);
////                chat.addTalkBox(-1, 0, "1000006", "六号床", "https://tva4.sinaimg.cn/large/9bd9b167ly1g1p9pt3g1jj20b40b40t8.jpg", "(*｡_｡)", new Date(), false);
////                chat.addTalkBox(0, 1, "5307397", "筠竹苑的小树林", "https://tva4.sinaimg.cn/large/9bd9b167ly1g1p9qmx8p1j20b40b40u3.jpg", "小树林里的卧龙凤雏", new Date(), false);
//            }
//            else {
//                loginController.doLoginError();
//            }
//        });
//        login.doShow();
//    }
//    public static void main(String[] args) {
//        launch(args);
//    }

}
