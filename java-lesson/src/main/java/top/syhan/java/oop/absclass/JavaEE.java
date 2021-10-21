package top.syhan.java.oop.absclass;

/**
 * @program: java-lesson
 * @description:
 * @author: SYH
 * @Create: 2021-10-21 17:08
 **/
public class JavaEE extends Developer{
    @Override
    public void work() {
        System.out.println("JavaEE工程师:员工号为: " + this.getId() + "的" + this.getName() + "员工, 正在研发淘宝网站");
    }
}
