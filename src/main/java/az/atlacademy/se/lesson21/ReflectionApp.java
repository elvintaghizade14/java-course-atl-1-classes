package az.atlacademy.se.lesson21;

import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionApp {

    public static void main1(String[] args) {
        Student elvin = new Student(24, "Elvin", 98.9);

        Class<? extends Student> elvinClass = elvin.getClass();
        System.out.println(elvinClass.getName());

        for (Method method : elvinClass.getMethods()) {
            System.out.println(method.getName());
        }

    }

    public static void main(String[] args) {
        Person elvin = new Person(150, "Elvin");
        System.out.println(elvin.getClass().getName());
        System.out.println(Arrays.toString(elvin.getClass().getMethods()));
        System.out.println(Arrays.toString(elvin.getClass().getFields()));
        System.out.println(Arrays.toString(elvin.getClass().getDeclaredFields()));
    }

}
