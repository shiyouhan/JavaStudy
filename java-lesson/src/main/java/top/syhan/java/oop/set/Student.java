package top.syhan.java.oop.set;

import java.util.Objects;

/**
 * @program: java-lesson
 * @description:
 * @author: SYH
 * @Create: 2021-11-09 19:34
 **/
public class Student implements Comparable<Student>{
    private Integer id;
    private String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(Student o) {
//        if (this.id < o.getId()) {
//            return 1;
//        } else if (this.id > o.getId()){
//            return -1;
//        } else {
//            return 0;
//        }
        return this.getId().compareTo(o.getId());
    }
}
