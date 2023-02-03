package az.atlacademy.module01.lesson22;

import az.atlacademy.module01.lesson21.Person;
import java.util.Arrays;

public class ReflectionApp {

    public static void main(String[] args) {
        Person elvin = new Person(150, "Elvin");
        System.out.println(elvin.getClass().getName());
        System.out.println(Arrays.toString(elvin.getClass().getMethods()));
        System.out.println(Arrays.toString(elvin.getClass().getFields()));
        System.out.println(Arrays.toString(elvin.getClass().getDeclaredFields()));
        System.out.println(Arrays.toString(elvin.getClass().getAnnotations()));
        System.out.println(Arrays.toString(elvin.getClass().getDeclaredMethods()));

        System.out.println(Arrays.toString(A.class.getDeclaredMethods()));
        System.out.println(Arrays.toString(A.class.getAnnotations()));
    }

    @FunctionalInterface
    interface A {

        void foo();
//        void foo2();

    }

}
