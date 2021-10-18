package top.syhan.java.basic.serialize;

import java.io.*;

/**
 * @program: java-basic
 * @description: Student类
 * @author: SYH
 * @Create: 2021-10-18 20:26
 **/
public class Student implements Serializable {

    private static final long serialVersionUID = -8556868018308487936L;

    private String name;
    private Integer age;
    private Integer score;
    private transient String passwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

//    /**
//     * 判断控制
//     * @param objectInputStream 对象输入流
//     * @throws  IOException 异常
//     * @throws ClassNotFoundException 异常
//     * */
//    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException, IllegalAccessException {
//        //调用默认的反序列化函数
//        objectInputStream.defaultReadObject();
//        //手工检查反序列化学生成绩的有效性，若发现有问题，即终止操作！
//        if (0 >score || 100 < score) {
//            throw new IllegalAccessException("学生分数只能在0到100之间！");
//        }
//    }

    @Override
    public String toString() {
        return "Student:" + '\n' +
                "name = " + this.name + '\n' +
                "age = " + this.age + '\n' +
                "score = " + this.score + '\n' +
                "passwd = " + this.passwd + '\n'
                ;
    }
}
