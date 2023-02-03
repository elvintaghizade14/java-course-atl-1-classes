package az.atlacademy.module01.lesson16;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionApp {

    public static void main(String[] args) {
        System.out.print("Enter input: ");
        final String line = new Scanner(System.in).nextLine();

        final String result = new MyFunction().apply(line);

        String result2 = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.concat(s);
            }
        }.apply(line);

        String result3 = ((Function<String, String>) s -> s.concat(s)).apply(line);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }

    static class MyFunction implements Function<String, String> {

        @Override
        public String apply(String s) {
            return s.concat(s);
        }

    }

}
