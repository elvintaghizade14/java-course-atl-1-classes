package az.atlacademy.module01.lesson19;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApp {

    public static void mainV1(String[] args) {
        List<Integer> results = Stream.of(1, 2, 3, 4, 5)
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        results.forEach(num -> System.out.print(num + " "));
    }

    public static void main(String[] args) {
        new Random()
                .ints()
                .limit(3)
                .map(num -> {
                    System.out.print(num + " ");
                    return num % 10;
                })
                .distinct()
//                .map(num -> {
//                    System.out.print(num + " ");
//                    return num;
//                })
                .filter(num -> num % 2 == 1)
//                .map(Integer::valueOf)
                .boxed()
//                .sorted(Comparator.reverseOrder())
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

}
