package Article;

import java.awt.*;
import java.util.List;

/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-11-06 21:25
 **/
public class Article {
    private String name;
    private String content;
    private List<Image> imageList;

    public Article() {

    }

    public Article(String name, String content, List<Image> imageList) {
        this.name = name;
        this.content = content;
        this.imageList = imageList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Image> getImageList() {
        return imageList;
    }

    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }
}
