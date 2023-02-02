package az.atlacademy.se.lesson23;

public class Printer extends Thread {

    public Printer() {
        System.out.println("Hello! -> " + currentThread());
    }

    @Override
    public void run() {
        System.out.println("Hello! -> " + currentThread().getName());
    }
}
