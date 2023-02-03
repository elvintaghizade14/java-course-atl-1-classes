package az.atlacademy.module01.lesson13;

public class ExceptionApp {

    public static void main(String[] args) {
        // foo(1);                        -> StackOverflowError
        // System.out.println(2 / 0);     -> ArithmeticException

        String name = null;
//                = new Scanner(System.in).nextLine();
        if (name == null) {
            System.out.println("You entered wrong value!");
        } else {
            for (int i = 0; i < 5; i++) {
                System.out.print(name.toUpperCase() + " ");
            }
        }


        try {
            String[] workers = {"A", "B"};
            workers[2] = "Elvin";
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("You cannot have more workers!");
        }
    }

    private static void foo(int a) {
        // if (a == 10) return;
        System.out.println(a);
        foo(a + 1);

        System.gc();
//        new MyClass().finalize();
    }

    static class MyClass extends Object {

    }

}
