package top.syhan.chat.ui.view.login;

/**
 * @program: chat-ui
 * @description: 窗体事件定义，例如将登陆、最小化、退出等在这里完成定义
 * @author: SYH
 * @Create: 2021-10-22 20:51
 **/
public class LoginEventDefine {

    private final LoginInit loginInit;
    private final ILoginEvent loginEvent;
    private final ILoginMethod loginMethod;

    public LoginEventDefine(LoginInit loginInit, ILoginEvent loginEvent, ILoginMethod loginMethod) {
        this.loginInit = loginInit;
        this.loginEvent = loginEvent;
        this.loginMethod = loginMethod;

        loginInit.move();
        min();
        quit();
        doEventLogin();
    }

    /**
     * 最小化事件
     */
    private void min() {
        loginInit.loginMin.setOnAction(event -> {
            System.out.println("最小化");
            loginInit.setIconified(true);
        });
    }

    /**
     * 退出事件
     */
    private void quit() {
        loginInit.loginClose.setOnAction(event -> {
            System.out.println("退出");
            loginInit.close();
            System.exit(0);
        });
    }

    /**
     * 登录事件
     */
    private void doEventLogin() {
        loginInit.loginButton.setOnAction(event -> {
            loginEvent.doLoginCheck(loginInit.userId.getText(), loginInit.userPassword.getText());
        });
    }

}
