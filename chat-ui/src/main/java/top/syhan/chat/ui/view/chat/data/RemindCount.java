package top.syhan.chat.ui.view.chat.data;

/**
 * @program: chat-ui
 * @description:
 * @author: SYH
 * @Create: 2021-10-23 18:44
 **/
public class RemindCount {

    /**
     * 消息提醒条数
     */
    private int count = 0;

    public RemindCount() {
    }

    public RemindCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
