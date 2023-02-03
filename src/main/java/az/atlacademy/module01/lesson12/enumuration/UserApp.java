package az.atlacademy.module01.lesson12.enumuration;

import java.util.Arrays;

public class UserApp {

    public static void mainV1(String[] args) {
        User elvin = new User("Elvin", "Lecturer");
        System.out.println(elvin);

        User elnur = new User("Elnur", "Trainer");
        System.out.println(elnur);

        User orxan = new User("Orxan", "Lecturer'");
        System.out.println(orxan);

        User elman = new User("Elman", "Student");
        System.out.println(elman);
    }

    public static void mainV2(String[] args) {
        UserWithRole elvin = new UserWithRole("Elvin", UserRole.LECTURER);
        System.out.println(elvin.toString());

        UserWithRole orxan = new UserWithRole("Orxan", UserRole.LECTURER);
        System.out.println(orxan);

        UserWithRole elman = new UserWithRole("Elman", UserRole.STUDENT);
        System.out.println(elman);

         elman = new UserWithRole("Elman2", UserRole.STUDENT);
        System.out.println(elman);
    }

    public static void main(String[] args) {
        UserWithEnum elvin = new UserWithEnum("Elvin", UserRoleEnum.LECTURER);
        System.out.println(elvin.toString());
        System.out.println(elvin.getRole().name());
        System.out.println(elvin.getRole().ordinal());
        System.out.println(Arrays.toString(UserRoleEnum.values()));
    }

}
