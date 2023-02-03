package az.atlacademy.module01.lesson19;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierApp {

    public static void main(String[] args) {
        System.out.println(random(1000));
        System.out.println(random(100));

        Function<Integer, Integer> random1 = upper -> (int) (Math.random() * upper);

        Supplier<Integer> random2 = () -> (int) (Math.random() * 1000);

        Predicate<String> isBlank = s -> s == null || "".equals(s);

        System.out.println(isBlank.test("Elvin"));
        System.out.println(isBlank.test(null));
        System.out.println(isBlank.test(""));
    }

    private static int random(int upper) {
        return (int) (Math.random() * upper);
    }


}
