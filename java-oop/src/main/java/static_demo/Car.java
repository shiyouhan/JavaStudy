package static_demo;

/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-10-29 17:01
 **/
public class Car {
    private String name ="hello word";
    public void test(){

        Engine engine = new Car().new Engine();
        engine.x ="word";
        System.out.println(engine.x);
    }
    class Engine{
        public  String x ="hello";
        public void show(){
            System.out.println(name );
        }
    }
}
