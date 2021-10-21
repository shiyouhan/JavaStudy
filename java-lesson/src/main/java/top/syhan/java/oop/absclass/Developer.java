package top.syhan.java.oop.absclass;

/**
 * @program: java-lesson
 * @description:
 * @author: SYH
 * @Create: 2021-10-21 17:06
 **/
public abstract class Developer {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Developer(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * 工作:抽象方法
     * */
    public abstract void work();

    public Developer() {

    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
