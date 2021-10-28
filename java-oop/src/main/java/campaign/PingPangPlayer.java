package campaign;
/**
 * @program: java-oop
 * @description:
 * @author: SYH
 * @Create: 2021-10-28 10:45
 **/
public class PingPangPlayer extends Player implements SpeakEnglish{

    @Override
    public void eat() {
        System.out.println("吃青菜");
    }

    @Override
    public void sport() {
        System.out.println("打世乒赛");
    }

    @Override
    public void speakEnglish() {

    }
}
