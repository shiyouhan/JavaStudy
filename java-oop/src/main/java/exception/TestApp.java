package exception;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-11-07 15:32
 **/
public class TestApp {
    public static void main(String[] args) {
        BusinessInterface businessInterface = new BusinessInterfaceImpl();
        List list = new ArrayList();
        List listTypeException = new ArrayList();
        List listImageSizeException = new ArrayList();
        Img image0 = new Img("C:\\Users\\apple\\Desktop\\IMAGE\\me.jpg");
        Img image1 = new Img("C:\\Users\\apple\\Desktop\\IMAGE\\1.png");
        Img image2 = new Img("C:\\Users\\apple\\Desktop\\IMAGE\\6.png");
        listTypeException.add(image2);
        for (int i = 0; i < 10; i++) {
            listImageSizeException.add("image"+i%3);
        }

        list.add(image1);

//        Article article = new Article();
        Article article = new Article("1","死那个石家庄人", "暴力", list);
        boolean result = false;
        try {
            result = businessInterface.insertArticle(article);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("我始终运行");
        }
        System.out.println(result);
    }

}
