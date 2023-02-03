package az.atlacademy.module01.lesson11;


import java.util.Arrays;

import static java.lang.Math.PI;
import static java.lang.Math.max;
import static java.lang.System.out;

public class App {
    public static void main(String[] args) {
        Person elvin = new Person(24, "Elvin", new int[]{1, 2});
        Person elvin1 = new Person(24, "Elvin", new int[]{1, 2});
        Person elvin2 = new Person(24, "Elvin", new int[]{1, 2});
        Person elvin3 = new Person(24, "Elvin", new int[]{1, 2});
        Person elvin4 = new Person(24, "Elvin", new int[]{1, 2});
        // az.atlacademy.se.lesson11.model.Person elvin5
        //        = new az.atlacademy.se.lesson11.model.Person(24, "Elvin", new int[]{1, 2});

        out.println(PI);
        out.println(PI);
        out.println(PI);
        out.println(PI);
        out.println(PI);
        if (2 == 2) {
            throw new IllegalArgumentException();
        }
        out.println(max(1, 2));
    }

    static class Person {

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
}
