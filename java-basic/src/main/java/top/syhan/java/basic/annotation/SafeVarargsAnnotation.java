package top.syhan.java.basic.annotation;

/**
 * @program: java-basic
 * @description:
 * @author: SYH
 * @Create: 2021-11-10 15:46
 **/
public class SafeVarargsAnnotation<S> {
    private S[] args;
    public SafeVarargsAnnotation(S... args){
        this.args = args;
    }
    public void loopPrintArgs(S... args){
        for (S arg : args){
            System.out.println(arg);
        }
    }
    public final void printSelfArgs(S... args){
        for (S arg : this.args) {
            System.out.println(arg);
        }
    }
    public static <T> void loopPrintInfo(T... infos){
        for(T info:infos){
            System.out.println(info);
        }
    }
    public static void main(String[] args) {
        SafeVarargsAnnotation.loopPrintInfo("A","B","C");
    }
}
