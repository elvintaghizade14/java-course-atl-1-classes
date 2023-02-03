package az.atlacademy.module01.lesson14;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class ArrayApp {

    public static void main(String[] args) {
        int[] nums = populate(1, 100, 10);

        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            if (min > curr) min = curr;
            if (max < curr) max = curr;
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(min);
        System.out.println(max);

        IntSummaryStatistics stats = Arrays.stream(nums).summaryStatistics();
        System.out.println(stats.getMax());
        System.out.println(stats.getMin());
        System.out.println(stats.getAverage());
        System.out.println(stats.getSum());

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static int[] populate(int start, int end, int length) {
        // input
        int[] nums = new int[length];

        // process
        for (int i = 0; i < length; i++) {
            nums[i] = (int) (Math.random() * end) + start;
        }

        // output
        return nums;
    }

}
