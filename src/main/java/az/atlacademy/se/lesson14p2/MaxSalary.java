package az.atlacademy.se.lesson14p2;

import java.util.Scanner;

public class MaxSalary {

    public static void main(String[] args) {
        // input
        Scanner input = new Scanner(System.in);

        // process
        float maxSalary = -1;
        while (input.hasNext()) {
            float salary = input.nextFloat();
            if (maxSalary < salary) maxSalary = salary;
        }

        // output
        System.out.printf("%.2f", maxSalary);
    }

}
