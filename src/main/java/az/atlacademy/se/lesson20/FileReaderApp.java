package az.atlacademy.se.lesson20;

import java.io.*;
import java.util.Arrays;

import static az.atlacademy.se.lesson20.MyPath.RESOURCE;

public class FileReaderApp {

    public static void main(String[] args) {

        try {
            File file = new File(RESOURCE + "/file-writer-1.txt");
            FileWriter fw = new FileWriter(file);
            fw.write("Hello!");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File file = new File(RESOURCE + "/file-writer-2.txt");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hello, World x3!\n");
            bw.write("Hello, World x4!");
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File file = new File(RESOURCE + "/file-writer-1.txt");
            FileReader fr = new FileReader(file);
            while (true) {
                int c = fr.read();
                if (c == -1) break;
                System.out.print((char) c);
            }
            System.out.println();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File file = new File(RESOURCE + "/file-writer-2.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String firstLine = br.readLine();
            System.out.println(firstLine);
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
