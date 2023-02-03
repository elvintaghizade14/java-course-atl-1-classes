package az.atlacademy.module01.lesson15;

import java.util.Arrays;

public class LoopApp {
    public static final String HELLO = "HELLO";

    public final String a = "a";

    public static void main(String[] args) {
        System.out.println(LoopApp.HELLO);
        System.out.println(new LoopApp().a);
        System.out.println(new LoopApp().new Human("Elvin1"));

        printArray(new int[]{1, 2, 3, 4, 5});
        System.out.println();
        printArray(new String[]{"A", "B", "C"});
        System.out.println();
        printArray(new char[]{'a', 'b', 'c'});
        System.out.println();
        printArray(new Object[]{null, "A", 1, 3.14, true, new LoopApp().new Human("Elvin")});

        System.out.println();
        printArray(new Boolean[]{true, false, true});
        System.out.println();
        printArray(new Integer[]{1, 2, 3});
        System.out.println();

    }

    private static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    private static void printArray(String[] words) {
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
    }

    private static void printArray(char[] symbols) {
        for (int i = 0; i < symbols.length; i++) {
            System.out.print(symbols[i] + " ");
        }
    }

//    private static void printArray(Object[] obj) {
//        for (int i = 0; i < obj.length; i++) {
//            System.out.print(obj[i] + " ");
//        }
//    }

    private static <T> void printArray(T[] ts) {
        String className = ts.getClass().getName();
        System.out.println(className);
        for (int i = 0; i < ts.length; i++) {
            System.out.print(ts[i] + " ");
        }
    }

    private static void printArrayV2(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    private static void printArrayV3(int[] nums) {
        Arrays.stream(nums)
                .mapToObj(num -> num + " ")
                .forEach(System.out::print);
    }

    final class Human {
        public final String name;

        public Human(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return String.format("{name='%s'}", name);
        }
    }

}
