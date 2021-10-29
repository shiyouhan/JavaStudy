package usb;


/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-10-28 10:11
 **/
public class NoteBook {

    private String band;
    private Integer size;

    public NoteBook(String band) {
        this.band = band;
    }

    public NoteBook() {

    }

    public NoteBook(Integer size) {
        this.size = size;
    }

    public void start() {
        System.out.println("笔记本打开");
    }

    public void shutdown() {
        System.out.println("笔记本关机");
    }

    public void useUSB (USB usb) {
        usb.open();
        usb.close();
    }
}
