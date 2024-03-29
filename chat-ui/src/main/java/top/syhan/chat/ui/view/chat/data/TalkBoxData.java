package top.syhan.chat.ui.view.chat.data;

/**
 * @program: chat-ui
 * @description:
 * @author: SYH
 * @Create: 2021-10-23 18:44
 **/
public class TalkBoxData {

    /**
     * 对话Id
     */
    private String talkId;
    /**
     * 对话类型
     */
    private Integer talkType;
    /**
     * 对话名称
     */
    private String talkName;
    /**
     * 对话头像
     */
    private String talkHead;

    public TalkBoxData() {
    }

    public TalkBoxData(String talkId, Integer talkType, String talkName, String talkHead) {
        this.talkId = talkId;
        this.talkType = talkType;
        this.talkName = talkName;
        this.talkHead = talkHead;
    }

    public Integer getTalkType() {
        return talkType;
    }

    public void setTalkType(Integer talkType) {
        this.talkType = talkType;
    }

    public String getTalkId() {
        return talkId;
    }

    public void setTalkId(String talkId) {
        this.talkId = talkId;
    }

    public String getTalkName() {
        return talkName;
    }

    public void setTalkName(String talkName) {
        this.talkName = talkName;
    }

    public String getTalkHead() {
        return talkHead;
    }

    public void setTalkHead(String talkHead) {
        this.talkHead = talkHead;
    }

}
