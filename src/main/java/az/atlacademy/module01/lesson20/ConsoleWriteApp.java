package az.atlacademy.module01.lesson20;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class ConsoleWriteApp {

    public static void main(String[] args) {
        System.out.println("a");

        try {
            FileOutputStream fos = new FileOutputStream("/Users/elvintaghizade14/IdeaProjects/course/atl/java-course-atl-1-classes/src/main/java/az/atlacademy/se/lesson20/resource/test1.txt");
            byte[] bytes = "Hello, World x2!".getBytes(StandardCharsets.UTF_8);
            System.out.println(Arrays.toString(bytes));
            fos.write(bytes);
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("---------");

        System.out.println(new Scanner(System.in).nextInt());
        try {
            System.out.println((char) 72);
            FileInputStream fis = new FileInputStream("/Users/elvintaghizade14/IdeaProjects/course/atl/java-course-atl-1-classes/src/main/java/az/atlacademy/se/lesson20/resource/test1.txt");
            byte[] bytes = fis.readAllBytes();
            System.out.println(Arrays.toString(bytes));
            System.out.println(new String(bytes));
            fis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
