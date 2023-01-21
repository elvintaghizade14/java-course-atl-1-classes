package az.atlacademy.se.lesson20;

import java.io.*;

import static az.atlacademy.se.lesson20.MyPath.RESOURCE;

public class FinallyApp {

    public static void main(String[] args) {

        try {
            File file = new File(RESOURCE + "/file-writer-2.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String firstLine = br.readLine();
            System.out.println(firstLine);
            if (br != null) br.close();
            if (fr != null) fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        final File file2 = new File(RESOURCE + "/file-writer-2.txt");
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(file2);
            br = new BufferedReader(fr);
            String firstLine = br.readLine();
            System.out.println(firstLine);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null && br != null) {
                try {
                    br.close();
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        try {
            int num = Integer.parseInt("e");
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            System.out.println("END!");
        }


    }

}
