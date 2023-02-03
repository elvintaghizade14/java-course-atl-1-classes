package az.atlacademy.module01.lesson14p2;

import java.util.Scanner;

public class OddDivisors {

    // v1
    public static void main(String[] args) {
        // input
        int num = new Scanner(System.in).nextInt();

        // process
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (i % 2 == 1) System.out.println(i);
            }
        }
    }

}
