package Article;

/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-11-06 22:05
 **/
public interface Publish {
    /**
     * 发帖检查
     * @return
     * @throws PublishException
     * */
    boolean checkPublish (Article article) throws PublishException;
}
