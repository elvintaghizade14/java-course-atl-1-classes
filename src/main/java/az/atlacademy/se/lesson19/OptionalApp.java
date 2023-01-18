package az.atlacademy.se.lesson19;

import java.util.Optional;
import java.util.Scanner;

public class OptionalApp {
    private static final String DECIMAL_REGEX = "^\\d*\\.\\d+|\\d+\\.\\d*$";

    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();

        String result = doOp(s);

        System.out.println(result);
    }

    private static String doOp(String s) {
        return validateInput(s)
                .map(validInput -> parseInput(validInput))
                .map(parsedResult -> parsedResult.get())
                .map(num -> String.valueOf(calcResult(num)))
                .orElse("Not a decimal!!!");
    }

    private static Optional<String> validateInput(String s) {
        if (s.matches(DECIMAL_REGEX))   return Optional.of(s);
        else                            return Optional.empty();
    }

    private static Optional<Integer> parseInput(String s) {
        try {
            return Optional.of(Integer.parseInt(s));
        }
        catch (NumberFormatException e) {
            return Optional.empty();
        }

    }

    private static int calcResult(int num) {
        return num * 2;
    }

}
