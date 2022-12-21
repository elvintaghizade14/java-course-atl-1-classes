package az.atlacademy.se.lesson14;

import java.util.Scanner;

public class LibraryApp {

    public static void main(String[] args) {
        // 1. input
        int num = new Scanner(System.in).nextInt();
        int pow = new Scanner(System.in).nextInt();

        // 2. process
        int result = num * num * num * num * num;
        double result2 = Math.pow(num, pow);

        // 3. output
        System.out.println(result);
        System.out.println(result2);
    }

}
