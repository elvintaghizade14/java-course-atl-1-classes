package az.atlacademy.module01.lesson24;

public class ConcurrencyApp {

    public static void mainV1(String[] args) {
        for (int i = 0; i < 1_000_000; i++) {
            new NumberIncrement().run();
            new NumberIncrement().run();
            new NumberIncrement().run();
            new NumberIncrement().run();
            new NumberIncrement().run();
            new NumberIncrement().run();
            new NumberIncrement().run();
            new NumberIncrement().run();
            new NumberIncrement().run();
        }
        System.out.println("---\n" + NumberIncrement.num);
    }

    public static void main(String[] args) {
        ((Runnable) () -> {
            for (int i = 0; i < 50; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                NumberIncrement.num++;
            }
        }).run();
        ((Runnable) () -> {
            for (int i = 0; i < 50; i++) {
                try {
                    Thread.sleep(11);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                NumberIncrement.num++;
            }
        }).run();
        System.out.println("---\n" + NumberIncrement.num);
    }

}
