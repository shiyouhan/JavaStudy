package top.syhan.java.oop.absclass;
/**
 * @program: java-lesson
 * @description:
 * @author: SYH
 * @Create: 2021-10-21 17:32
 **/
public class Employee {
    public static void main(String[] args) {
        Developer JavaEE = new JavaEE();
        JavaEE.setId(101);
        JavaEE.setName("张三");
        JavaEE.work();
        Developer Anoroid = new Anoroid();
        Anoroid.setId(102);
        Anoroid.setName("李四");
        Anoroid.work();
        Developer Network = new Network();
        Network.setId(103);
        Network.setName("王五");
        Network.work();
        Developer Hardware = new Hardware();
        Hardware.setId(104);
        Hardware.setName("赵六");
        Hardware.work();
    }
}
