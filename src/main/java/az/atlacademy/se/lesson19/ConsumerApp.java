package az.atlacademy.se.lesson19;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerApp {

    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5);

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        System.out.println("--------------------");
        for (Integer num : nums) {
            System.out.println(num);
        }
        System.out.println("--------------------");

        nums.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        System.out.println("--------------------");

        nums.forEach(num -> System.out.println(num));
        System.out.println("--------------------");

        nums.forEach(System.out::println);
    }

}
