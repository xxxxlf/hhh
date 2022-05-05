package myByteStream;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = -7768595452327068344L;
    private String name;
    private int age;
// test for git
    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }


    public Student() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
