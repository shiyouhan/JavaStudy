package Article;

import cn.hutool.core.io.FileTypeUtil;
import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.util.List;

/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-11-06 22:12
 **/
public class PublishImpl implements Publish {

    @Override
    public boolean checkPublish(Article article) throws PublishException {
        List<Image> imageList = article.getImageList();

        if (article.getName().isEmpty()) {
            throw new PublishException(ExceptionEnume.TITLE_NOT_NULL_EXCEPTION.getName());
        } else if (article.getName().length() > ExceptionEnume.TITLE_SIZE_OVER_EXCEPTION.getSize()) {
            throw new PublishException(ExceptionEnume.TITLE_SIZE_OVER_EXCEPTION.getName());
        } else if (article.getContent().contains("杀人")) {
            throw new PublishException(ExceptionEnume.CONTENT_CONTAINS_ILLEGAL_WORDS_EXCEPTION.getName());
        } else if (imageList.size() > 9) {
            throw new PublishException(ExceptionEnume.IMAGE_LIST_SIZE_OVER_EXCEPTION.getName());
        }
        imageList.forEach(i -> {
            File file = FileUtil.file(i.getUrl());
            String type = FileTypeUtil.getType(file);
            long fileSize = file.length();
            if (!type.equals(ExceptionEnume.IMAGE_TYPE_EXCEPTION.getType()[0]) && !type.equals(ExceptionEnume.IMAGE_TYPE_EXCEPTION.getType()[1])) {
                throw new PublishException(ExceptionEnume.IMAGE_TYPE_EXCEPTION.getName());
            } else if (fileSize > ExceptionEnume.IMAGE_SIZE_EXCEPTION.getSize()) {
                throw new PublishException(ExceptionEnume.IMAGE_SIZE_EXCEPTION.getName());
            }
        });
        return true;
    }
}
