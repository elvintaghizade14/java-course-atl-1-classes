package az.atlacademy.module01.lesson17;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchApp {

    public static void main(String[] args) {
        int[] nums = populate(25);
        int[] nums2 = populate(12);
        System.out.println(Arrays.toString(nums2));

        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        Scanner in = new Scanner(System.in);
        int indexOf2 = Arrays.binarySearch(nums, in.nextInt());
        int indexOfMinus100 = Arrays.binarySearch(nums, in.nextInt());

        System.out.println(indexOf2);
        System.out.println(indexOfMinus100);
    }

    private static int[] populate(int size) {
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = (int) (Math.random() * 100 + 1);
        }
        return nums;
    }

}
