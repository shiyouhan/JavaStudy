package top.syhan.chat.ui.view.face;

import top.syhan.chat.ui.UIObject;
import top.syhan.chat.ui.view.chat.ChatInit;
import top.syhan.chat.ui.view.chat.IChatEvent;
import top.syhan.chat.ui.view.chat.IChatMethod;

/**
 * @program: chat-ui
 * @description: 设置表情框位置
 * @author: SYH
 * @Create: 2021-10-25 19:51
 **/
public class FaceController extends FaceInit implements IFaceMethod {

    private FaceView faceView;


    public FaceController(UIObject obj, ChatInit chatInit, IChatEvent chatEvent, IChatMethod chatMethod) {
        super(obj);
        this.chatInit = chatInit;
        this.chatEvent = chatEvent;
        this.chatMethod = chatMethod;
    }


    @Override
    public void initView() {
        faceView = new FaceView(this);
    }

    @Override
    public void initEventDefine() {
        new FaceEventDefine(this);
    }

    @Override
    public void doShowFace(Double x, Double y) {
        // 设置位置 X
        setX(x + 230 * (1 - 0.618));
        // 设置位置 Y
        setY(y - 160);
        // 展示窗口
        show();
    }
}
