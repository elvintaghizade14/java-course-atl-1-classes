package az.atlacademy.se.lesson23;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Thread.currentThread;

public class ExecutionServiceApp {

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        ExecutorService es = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        for (int i = 0; i < 100; i++) {
            es.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Hello! -> " + currentThread().getName());
                }
            });

            es.execute(() -> System.out.println("Hello! -> " + currentThread().getName()));
        }
    }

}
