package top.syhan.java.basic.serialize;

import java.io.*;

/**
 * @program: java-basic
 * @description: Student类的序列化和反序列化
 * @author: SYH
 * @Create: 2021-10-18 20:28
 **/
public class StudentSerialize {
    /**
     * 序列化
     *
     * @throws IOException IO异常
     */
    public static void serialize() throws IOException {
        Student student = new Student();
        student.setName("Java学习者");
        student.setAge(20);
        student.setScore(1000);

        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(new FileOutputStream("student.txt"));
        objectOutputStream.writeObject(student);
        objectOutputStream.close();

        System.out.println("序列化成功！已经生成student.txt文件");
        System.out.println("==============================================");
    }

    /**
     * 反序列化
     *
     * @throws IOException            IO异常
     * @throws ClassNotFoundException 类找不到异常
     */
    public static void deserialize() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream("student.txt"));
        Student student = (Student) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println("反序列化结果为：");
        System.out.println(student);
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //先执行序列化
        //serialize();
        //成功后看到生成了student.txt再执行下面的反序列化
        deserialize();
    }
}
