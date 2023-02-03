package az.atlacademy.module01.lesson23;

import static java.lang.Thread.currentThread;

public class PrinterV2 implements Runnable {

    public PrinterV2() {
        System.out.println("Hello! -> " + currentThread());
    }

    @Override
    public void run() {
        System.out.println("Hello! -> " + currentThread().getName());
    }

}
