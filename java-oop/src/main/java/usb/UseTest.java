package usb;

/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-10-28 10:16
 **/
public class UseTest {

    public static void main(String[] args) {
        NoteBook noteBook = new NoteBook();
        noteBook.start();
        noteBook.useUSB(new Mouse());
        noteBook.useUSB(new Keyboard());
        noteBook.shutdown();
    }
}
