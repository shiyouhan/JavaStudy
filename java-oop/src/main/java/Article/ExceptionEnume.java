package Article;

/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-11-06 22:19
 **/
public class ExceptionEnume {
    private String name;
    private Integer size;
    private String[] type;

    ExceptionEnume(String name, Integer size, String[] type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String[] getType() {
        return type;
    }

    public void setType(String[] type) {
        this.type = type;
    }
}
