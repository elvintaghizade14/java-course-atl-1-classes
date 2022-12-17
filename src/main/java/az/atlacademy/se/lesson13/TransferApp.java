package az.atlacademy.se.lesson13;

import java.util.Scanner;

public class TransferApp {

    public static void main(String[] args) {
        int amount = new Scanner(System.in).nextInt();
        try {
            checkAmount(amount);
            Integer.parseInt("123a");
        } catch (InsufficientBalanceException e) {
            System.out.println("Balansda kifayet qeder pul yoxdur");
        }

    }

    public static void checkAmount(int amount) throws InsufficientBalanceException {
        int balance = 10;
        if (amount > balance)
            throw new InsufficientBalanceException();
//            throw new InsufficientBalanceException("Balansda kifayet qeder pul yoxdur, hesab nomresi: " + "Elvin123");

    }

}
