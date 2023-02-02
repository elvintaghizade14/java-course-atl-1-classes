package az.atlacademy.se.lesson23;

import static java.lang.Thread.currentThread;

public class MultithreadingApp {

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

        System.out.println();

        System.err.println("ABC!");

        System.out.println("ABC");

        for (int i = 0; i < 10; i++) {
            new Printer().start();
            new Printer().start();
        }

        for (int i = 0; i < 10; i++) {
            new PrinterV2().run();
            new PrinterV2().run();
        }

        for (int i = 0; i < 10; i++) {
            ((Runnable) () -> System.out.println("Hello! -> " + currentThread().getName())).run();
            ((Runnable) () -> System.out.println("Hello! -> " + currentThread().getName())).run();
        }

    }

}
