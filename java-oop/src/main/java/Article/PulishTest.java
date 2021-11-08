package Article;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-11-07 13:44
 **/
public class PulishTest {
    public static void main(String[] args) {
        Publish publish = new PublishImpl();
        List list = new ArrayList();
        List listTypeException = new ArrayList();
        List listImageSizeException = new ArrayList();
        Image image0 = new Image("美女", "C:\\Users\\wanglin\\Desktop\\刘璇\\1.png");
        Image image1 = new Image("美女", "C:\\Users\\wanglin\\Desktop\\刘璇\\3.JPG");
        Image image2 = new Image("美女", "C:\\Users\\wanglin\\Downloads\\2.gif");
        listTypeException.add(image2);
        for (int i = 0; i < 10; i++) {
            listImageSizeException.add("image"+i%3);
        }

        list.add(image1);
        list.add(image2);

        Article article = new Article("死那个石家庄人", "" +
                "放火 生意爆翻天",
                list);
        boolean result = false;
        try {
            result = publish.checkPublish(article);

        } catch (PublishException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("我始终运行");
        }
        System.out.println(result);
    }
}
