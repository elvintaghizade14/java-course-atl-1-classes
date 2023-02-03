package az.atlacademy.module01.lesson17;

import java.util.Arrays;
import java.util.Scanner;

public class ComplexityAnalysisApp {

    public static void main(String[] args) {
        int[] nums = new int[50];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100 + 1);
        }

        System.out.println(Arrays.toString(nums));

        int numToFind = new Scanner(System.in).nextInt();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            ++count;
            if (nums[i] == numToFind) {
                System.out.println("Index of " + numToFind + " is: " + i);
            }
        }
        System.out.println("Operation count: " + count);
    }

}
