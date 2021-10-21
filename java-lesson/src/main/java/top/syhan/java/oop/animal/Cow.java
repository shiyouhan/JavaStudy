package top.syhan.java.oop.animal;

/**
 * @program: java-lesson
 * @description:
 * @author: SYH
 * @Create: 2021-10-21 17:49
 **/
public class Cow extends Animal{
    public Cow(String cowName, String cowFeature) {
        super(cowName, cowFeature);
    }

    @Override
    public void beasts() {
        System.out.println(this.name +this.feature);
    }
}
