package exception;

/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-11-07 14:33
 **/
public interface BusinessInterface {
    /**
     * @param article
     * @return
     * @throws MyException
     * */
    boolean insertArticle(Article article) throws MyException;
}
