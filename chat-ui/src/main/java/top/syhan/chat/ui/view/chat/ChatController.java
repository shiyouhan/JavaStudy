package top.syhan.chat.ui.view.chat;

/**
 * @program: chat-ui
 * @description: 窗体的控制管理类
 * @author: SYH
 * @Create: 2021-10-22 22:03
 **/
public class ChatController extends ChatInit implements IChatMethod{

    private ChatEventDefine chatEventDefine;

    @Override
    public void initView() {

    }

    @Override
    public void initEventDefine() {
        chatEventDefine = new ChatEventDefine(this);
    }

    @Override
    public void doShow() {
        super.show();
    }

}
