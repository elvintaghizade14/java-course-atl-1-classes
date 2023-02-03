package az.atlacademy.module01.lesson21;

import static az.atlacademy.module01.lesson21.MyPath.RESOURCE;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.xml.XmlMapper;
import java.io.File;
import java.io.IOException;

public class JsonApp {

    public static void main(String[] args) {
        Student elvin = new Student(24, "Elvin", 98.9);

        ObjectMapper ob = new ObjectMapper();
        try {
            ob.writeValue(new File(RESOURCE + "/student3.json"), elvin);
        } catch (IOException e) {
            e.printStackTrace();
        }

        XmlMapper xmlMapper = new XmlMapper();
        try {
            xmlMapper.writeValue(new File(RESOURCE + "/student3.xml"), elvin);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
