package usb;

/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-10-28 13:57
 **/
public class Keyboard implements USB {

    @Override
    public void open() {
        System.out.println("键盘连上了");
    }

    @Override
    public void close() {
        System.out.println("键盘断开了");
    }
}
