package az.atlacademy.se.lesson21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamApp {

    public static void main(String[] args) {
        Student elvin = new Student(24, "Elvin", 98.9);

        final File file = new File(MyPath.RESOURCE + "students2.ser");

        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(elvin);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Object readObject = ois.readObject();
            if (readObject instanceof Student) {
                Student readStudent = (Student) readObject;
                System.out.println(readStudent);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
