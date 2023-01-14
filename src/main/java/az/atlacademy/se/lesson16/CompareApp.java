package az.atlacademy.se.lesson16;

import java.util.*;
import java.util.stream.IntStream;

public class CompareApp {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(-1);
        nums.add(3);

        System.out.println(nums);
        // Collections.sort(nums);
        // Collections.sort(nums, new IntegerCustomComparator());
        // Collections.sort(nums, new Comparator<Integer>() {
        //     @Override
        //     public int compare(Integer x, Integer y) {
        //         return (x < y) ? -1 : ((x == y) ? 0 : 1);
        //     }
        // });
        // Collections.sort(nums, (x, y) -> (x < y) ? -1 : ((x == y) ? 0 : 1));
        // Collections.sort(nums, (x, y) -> x.compareTo(y));
        Collections.sort(nums, Integer::compareTo);
        System.out.println(nums);
    }

}
