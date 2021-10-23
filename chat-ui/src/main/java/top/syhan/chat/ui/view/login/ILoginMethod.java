package top.syhan.chat.ui.view.login;

/**
 * @program: chat-ui
 * @description: 方法接口类，桌面程序的开发基本都是事件触达和等待回调，那么我们给外部提供接口主要用于类似登陆处理完毕后，
 * 来执行相应方法进行窗体切换或者数据填充
 * @author: SYH
 * @Create: 2021-10-22 20:47
 **/
public interface ILoginMethod {

    /**
     * 打开登陆窗口
     */
    void doShow();

    /**
     * 登陆失败
     */
    void doLoginError();

    /**
     * 登陆成功；跳转聊天窗口（关闭登陆窗口，打开新窗口）
     */
    void doLoginSuccess();
}
