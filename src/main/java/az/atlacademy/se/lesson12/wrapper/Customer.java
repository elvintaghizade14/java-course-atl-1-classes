package az.atlacademy.se.lesson12.wrapper;

public class Customer {

    private String name;
    private boolean thief1; // true, false
    private Boolean thief2; // true, false, null

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{name='" + name + "', thief1=" + thief1 + ", thief2=" + thief2 + "}";
    }

    public static void main(String[] args) {
        Customer elvin = new Customer("Elvin");
        System.out.println(elvin.thief1);
        // System.out.println(elvin.thief2.toString());
        int i = Integer.parseInt("123");
        int maxValue = Integer.MAX_VALUE;
        System.out.println(i);
        System.out.println(maxValue);

        int i1 = Integer.parseInt("123");
        System.out.println(i1); // 123

        // int i2 = Integer.parseInt("123a");
        // System.out.println(i2);

        int[] ints = {1};
        System.out.println(ints[0]); // 1
//        System.out.println(ints[1]); // 1

        String a = "Elvin_ 123'";
        System.out.println(a.charAt(3));   // i
        System.out.println(a.charAt(0));   // E
        System.out.println(a.charAt(10));  // '
        System.out.println(a.charAt(100)); // StringIndexOutOfBoundsException
    }
}
