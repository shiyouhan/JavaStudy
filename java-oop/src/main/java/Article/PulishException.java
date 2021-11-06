package Article;

/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-11-06 22:09
 **/
public class PulishException extends RuntimeException{
    public PulishException() {

    }

    public PulishException(String message) {
        super(message);
    }
}
