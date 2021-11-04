package top.syhan.java.oop.blog;

/**
 * @program: java-lesson
 * @description:
 * @author: SYH
 * @Create: 2021-11-04 09:24
 **/
public class Article {
    private String title;
    private String contect;

    public Article(String title,String contect) {
        this.title = title;
        this.contect = contect;
    }

    public Article() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContect() {
        return contect;
    }

    public void setContect(String contect) {
        this.contect = contect;
    }
}
