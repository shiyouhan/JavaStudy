package Article;

/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-11-06 22:09
 **/
public class PublishException extends RuntimeException{
    public PublishException() {

    }

    public PublishException(String message) {
        super(message);
    }
}
