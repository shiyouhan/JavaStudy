package top.syhan.java.oop.blog;

/**
 * @program: java-lesson
 * @description:
 * @author: SYH
 * @Create: 2021-11-04 09:28
 **/
public class Picture {
    private Double number;

    public Picture (Double number) {
        this.number = number;
    }
    public Picture() {

    }

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }
}
