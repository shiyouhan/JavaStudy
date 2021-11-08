package exception;

import java.io.File;
import java.util.List;

/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-11-07 14:32
 **/
public class BusinessInterfaceImpl implements BusinessInterface{

    private static final int MAX_LENGTH = 20;
    private static final String[] arr = {"暴力", "恐怖", "残忍"};

    @Override
    public boolean insertArticle(Article article) throws MyException {
        if (article.getTitle().length() > MAX_LENGTH) {
            throw new MyException("标题过长");
        }
        for (int i = 0, len = arr.length; i < len ; i++) {
            if (article.getContent().contains(arr[i])) {
                throw new MyException("内容有禁词");
            }
        }
        List<Img> imgList = article.getImgList();
        imgList.forEach(img -> {
            File file = new File(img.getUrl());
            int length = (int) file.length();
            if (length > 1024 * 1024 * 2) {
                throw new MyException("图片过大");
            }
        });
        return true;
    }
}
