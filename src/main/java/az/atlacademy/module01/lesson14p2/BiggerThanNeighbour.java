package az.atlacademy.module01.lesson14p2;

public class BiggerThanNeighbour {

    public static void main(String[] args) {
        System.out.println(
                findBiggerCount(9, new int[]{9, 5, -7, -7, 5, -9, 4})
        );

        System.out.println(
                findBiggerCount(10, new int[]{-8, -10, -2, 1, -9, 5, -9, 0, 0, -9})
        );
    }

    private static int findBiggerCount(int n, int[] nums) {
        // base condition
        if (n <= 2) return 0;

        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            int prev = nums[i - 1];
            int curr = nums[i];
            int next = nums[i + 1];
            if (curr > prev && curr > next) count++;
        }
        return count;
    }

}
