package az.atlacademy.se.lesson13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UncheckedExceptionApp {

    public static void main(String[] args) {

        try {
            int num = new Scanner(System.in).nextInt();
            System.out.println(10 / num);

            File file = new File("a1.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            System.out.println(line);
        }
        catch (IOException e) {
            e.printStackTrace();
            System.out.println("Exception handled!");
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("Hooray");

    }
}
