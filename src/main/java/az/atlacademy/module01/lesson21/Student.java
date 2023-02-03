package az.atlacademy.module01.lesson21;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = 2L;

    public final int age;
    public final String name;
    public final double grade;

    public Student(int age, String name, double grade) {
        this.age = age;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return String.format("%d;%f;%s", age, grade, name);
    }
}
