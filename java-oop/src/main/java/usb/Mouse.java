package usb;


/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-10-28 10:09
 **/
public class Mouse implements USB {

    @Override
    public void open() {
        System.out.println("鼠标连上了");
    }

    @Override
    public void close() {
        System.out.println("鼠标断开了");
    }
}
