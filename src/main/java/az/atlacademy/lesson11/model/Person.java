package az.atlacademy.lesson11.model;


import java.util.Arrays;

public final class Person {

    private final int age;
    private final String name;
    private final int[] courseIds;

    public Person(int age, String name, int[] courseIds) {
        this.age = age;
        this.name = name;
        this.courseIds = courseIds;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int[] getCourseIds() {
        final int[] copiedCourseIds = new int[courseIds.length];

        System.arraycopy(courseIds, 0, copiedCourseIds, 0, courseIds.length);

        return copiedCourseIds;
    }

    @Override
    public String toString() {
        return String.format("Person{age=%d, name='%s', courseIds=%s}", age, name, Arrays.toString(courseIds));
    }
}
