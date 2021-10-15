package top.syhan.java.basic.oop;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @program: java-basic
 * @description:
 * @author: SYH
 * @Create: 2021-10-15 19:27
 **/

@Data
class Address implements Cloneable {
    private Integer id;
    private String describe;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
@Data
class Student implements Cloneable {
    private Integer id;
    private String name;
    private Address address;

    @Override
    protected Object clone() throws  CloneNotSupportedException {
        //浅拷贝
        return super.clone();
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        //深拷贝
//        Student s = (Student) super.clone();
//        s.address = (Address) this.address.clone();
//        return s;
//    }
}

/**
 * @author apple
 */

@Slf4j
public class ShallowDrDeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student();
        student.setId(1);
        student.setName("han");
        Address address = new Address();
        address.setId(2);
        address.setDescribe("Wuxi Jiangsu");
        student.setAddress(address);

        Student cloneStudent = (Student) student.clone();
        log.info("**************************浅拷贝还是深拷贝*****************************");
        log.info("Student == cloneStudent: {}", student == cloneStudent);
        log.info("二级对象内容: {}",student.getAddress() == cloneStudent.getAddress());
        log.info("二级对象中内容: {}",student.getAddress().getDescribe() ==
                cloneStudent.getAddress().getDescribe());

        log.info("******************************修改属性前*******************************");
        log.info(student.toString());
        log.info(cloneStudent.toString());
        student.setName("施友涵");
        address.setDescribe("江苏无锡");
        log.info("******************************修改属性后*******************************");
        log.info(student.toString());
        log.info(cloneStudent.toString());
    }
}

