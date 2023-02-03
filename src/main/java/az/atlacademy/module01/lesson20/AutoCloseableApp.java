package az.atlacademy.module01.lesson20;

import java.io.*;

import static az.atlacademy.module01.lesson20.MyPath.RESOURCE;

public class AutoCloseableApp {

    public static void main(String[] args) {

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

        System.out.println("-------");

        final File file = new File(RESOURCE + "/file-writer-1.txt");
        try (FileReader fr = new FileReader(file)) {
            while (true) {
                int c = fr.read();
                if (c == -1) break;
                System.out.print((char) c);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
            String firstLine = br.readLine();
            System.out.println(firstLine);
        } catch (IOException e) {
            e.printStackTrace();
        }

        final File file3 = new File(RESOURCE + "/file-writer-3.txt");
        try {
            FileWriter fw = new FileWriter(file3);
            fw.write("Hello! - V3");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter fw = new FileWriter(file3)) {
            fw.write("Hello! - V4");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
