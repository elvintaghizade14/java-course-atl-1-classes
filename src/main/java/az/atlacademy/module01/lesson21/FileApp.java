package az.atlacademy.module01.lesson21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class FileApp {

    public static void main(String[] args) {
        Student elvin = new Student(24, "Elvin", 98.9);

        final File file = new File(MyPath.RESOURCE + "students.txt");
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(elvin.toString().getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
            String line = br.readLine();
            String[] splitedValue = line.split(";");
            System.out.println(Arrays.toString(splitedValue));
            Student readStudent = new Student(Integer.parseInt(splitedValue[0]),
                    splitedValue[2], Double.parseDouble(splitedValue[1]));
            System.out.println(readStudent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
