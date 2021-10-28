package campaign;

/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-10-28 14:22
 **/
public class PingPangCoach extends Coach implements SpeakEnglish{

    public PingPangCoach() {

    }

    public PingPangCoach(String name, Integer age) {
        super(name,age);
    }
    @Override
    public void teach() {
        System.out.println("教接发球");
    }

    @Override
    public void eat() {
        System.out.println("吃大白菜，喝白开水");
    }

    @Override
    public void speakEnglish() {
        System.out.println("hello");
    }
}
