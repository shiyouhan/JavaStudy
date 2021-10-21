package top.syhan.java.oop.absclass;

/**
 * @program: java-lesson
 * @description:
 * @author: SYH
 * @Create: 2021-10-21 17:16
 **/
public class Network extends Developer{
    @Override
    public void work() {
        System.out.println("Network工程师:员工号为: " + this.getId() + "的" + this.getName() + "员工, 正在检查网络是否畅通");
    }
}
