package Article;

import java.util.List;

/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-11-06 22:12
 **/
public class PublishImpl {
    public boolean checkPulish(Article article) throws PulishException {
        List<Image> imageList = article.getImageList();

        if (article.getName().isEmpty()) {
            throw new PulishException(ExceptionEnume.T)
        }
    }
}
