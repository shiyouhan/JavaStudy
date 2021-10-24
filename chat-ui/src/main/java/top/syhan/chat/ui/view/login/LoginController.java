package top.syhan.chat.ui.view.login;

import javafx.scene.control.Alert;

/**
 * @program: chat-ui
 * @description: 窗体的控制管理类，也是一个窗体的管家，它会继承窗体的装载、实现接口方法、初始化界面、初始化事件定义
 * @author: SYH
 * @Create: 2021-10-22 20:49
 **/
public class LoginController extends LoginInit implements ILoginMethod {

    public LoginController(ILoginEvent loginEvent) {
        super(loginEvent);
    }

    @Override
    public void initView() {
        LoginView loginView = new LoginView(this, loginEvent);
    }

    @Override
    public void initEventDefine() {
        LoginEventDefine loginEventDefine = new LoginEventDefine(this, loginEvent, this, this);
    }

    @Override
    public void doShow() {
        super.show();
    }

    @Override
    public void doLoginError() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.titleProperty().set("提示");
        alert.headerTextProperty().set("登陆失败！");
        alert.showAndWait();
    }

    @Override
    public void doLoginSuccess() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.titleProperty().set("提示");
        alert.headerTextProperty().set("登陆成功！");
        alert.showAndWait();
        // 关闭原窗口
        close();
    }
}
