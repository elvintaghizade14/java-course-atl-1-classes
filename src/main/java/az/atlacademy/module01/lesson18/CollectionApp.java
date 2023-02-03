package az.atlacademy.module01.lesson18;

import java.util.Arrays;

public class CollectionApp {

    public static void main(String[] args) {
        int[] nums = {1, -2, 3, -4, -5, 0};
        String[] chars = {"A", "a", "B", "c", "E"};

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(chars));
        Arrays.sort(nums);
        Arrays.sort(chars);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(chars));

        Person[] people = {
                new Person(24, "Elvin", 70),
                new Person(20, "Ali", 85),
                new Person(22, "Abc", 98.91),
        };

        System.out.println(Arrays.toString(people));
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
    }

}
