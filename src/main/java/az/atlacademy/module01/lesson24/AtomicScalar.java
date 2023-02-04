package az.atlacademy.module01.lesson24;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicScalar {

    private static final AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void main(String[] args) {
        ((Runnable) () -> {
            for (int i = 0; i < 50; i++) {
                atomicInteger.incrementAndGet();
            }
        }).run();
        ((Runnable) () -> {
            for (int i = 0; i < 50; i++) {
                atomicInteger.incrementAndGet();
            }
        }).run();
        ((Runnable) () -> {
            for (int i = 0; i < 50; i++) {
                atomicInteger.incrementAndGet();
            }
        }).run();
        System.out.println(atomicInteger.get());
    }

}
