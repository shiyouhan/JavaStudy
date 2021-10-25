package top.syhan.chat.ui.view.face;

/**
 * @program: chat-ui
 * @description: 定义表情框隐藏事件
 * @author: SYH
 * @Create: 2021-10-25 19:51
 **/
public class FaceEventDefine {

    private  FaceInit faceInit;

    public FaceEventDefine(FaceInit faceInit) {
        this.faceInit = faceInit;
        hideFace();
    }

    private void hideFace() {
        faceInit.root().setOnMouseExited(event -> faceInit.hide());
    }
}
