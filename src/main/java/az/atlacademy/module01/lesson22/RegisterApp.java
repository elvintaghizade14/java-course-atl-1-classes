package az.atlacademy.module01.lesson22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class RegisterApp {

    private static final List<String> DB = new ArrayList<>(
            Arrays.asList("a@a.com", "b@b.az", "c@c.eu")
    );

    public static void main(String[] args) {
        // input
        String email = new Scanner(System.in).nextLine();
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("email cannot be empty!");
        }

        // process
        Optional<String> result = DB.stream()
                .filter(info -> info.equalsIgnoreCase(email))
                .findFirst();
        if (result.isPresent()) {
            throw new EmailAlreadyExistsException("email: " + email + " already exists!");
        }

        // output
        DB.add(email);

        System.out.println(DB);
    }

}
