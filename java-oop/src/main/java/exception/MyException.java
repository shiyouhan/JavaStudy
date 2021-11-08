package exception;

/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-11-07 14:30
 **/
public class MyException extends RuntimeException{
    public MyException(String message) {
        super(message);
    }

    public MyException() {

    }
}
