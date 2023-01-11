package az.atlacademy.se.lesson18;

public class Person implements Comparable<Person>{

    private int age;
    private String name;
    private double grade;

    public Person(int age, String name, double grade) {
        this.age = age;
        this.name = name;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Person that) {
        return Integer.compare(this.age, that.age);
    }
}
