package Article;

/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-11-06 22:00
 **/
public class Image {
    private  String name;
    private String url;

    public Image() {

    }

    public Image(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
