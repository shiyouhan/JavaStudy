package campaign;

/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-10-28 14:26
 **/
public class PersonTest {

    public static void main(String[] args) {
        Person person1 = new BasketCoach("张三", 45);
        System.out.println(person1);
        person1.eat();

        person1 = new PingPangCoach("李四",50);
        System.out.println(person1);
        person1.eat();

        PingPangCoach pingPangCoach = (PingPangCoach) person1;
        pingPangCoach.teach();
        pingPangCoach.speakEnglish();
    }
}
