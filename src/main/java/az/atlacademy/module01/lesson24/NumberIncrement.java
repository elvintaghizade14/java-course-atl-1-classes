package az.atlacademy.module01.lesson24;

public class NumberIncrement implements Runnable {

    public /*volatile*/ static int num = 0;

    public NumberIncrement() {

    }

    @Override
    public void run() {
        incrementNum();
        new NumberIncrement();
    }

    private synchronized void incrementNum() {
        num++;
    }

}
