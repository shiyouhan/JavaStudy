package top.syhan.java.oop.absclass;

/**
 * @program: java-lesson
 * @description:
 * @author: SYH
 * @Create: 2021-10-21 17:19
 **/
public class Hardware extends Developer{
    @Override
    public void work() {
        System.out.println("Hardware工程师:员工号为: " + this.getId() + "的" + this.getName() + "员工, 正在修复打印机");
    }
}
