package top.syhan.java.oop.animal;

/**
 * @program: java-lesson
 * @description:
 * @author: SYH
 * @Create: 2021-10-21 17:48
 **/
public class Pig extends Animal {
    public Pig(String pigName, String pigFeature) {
        super(pigName, pigFeature);
    }
    @Override
    public void beasts() {
        System.out.println(this.name +this.feature);
    }
}
