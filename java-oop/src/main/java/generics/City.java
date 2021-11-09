package generics;

/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-11-09 15:38
 **/
public class City {
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" + "name='" + name + '\'' + '}';
    }
}
