package Article;

/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-11-06 22:19
 **/
public enum ExceptionEnume {

    TITLE_NOT_NULL_EXCEPTION("文章标题不能为空", 0, null),
    TITLE_SIZE_OVER_EXCEPTION("文章标题不能超过20", 20, null),
    CONTENT_CONTAINS_ILLEGAL_WORDS_EXCEPTION("文章包含禁词", 0, new String[]{"杀人", "暴力","学习"}),
    IMAGE_LIST_SIZE_OVER_EXCEPTION("图片数量不能超过九张", 9, null),
    IMAGE_TYPE_EXCEPTION("图片格式只能是jpg或者png", 0, new String[]{"jpg", "png"}),
    IMAGE_SIZE_EXCEPTION("图片大小不能超过2M", 2 * 1024, null);

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
