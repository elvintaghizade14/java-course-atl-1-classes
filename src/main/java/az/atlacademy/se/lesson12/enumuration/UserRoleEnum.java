package az.atlacademy.se.lesson12.enumuration;

public enum UserRoleEnum {

    STUDENT("Student"),
    TRAINER("Trainer"),
    LECTURER("Lecturer");

    private final String name;

    UserRoleEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{roleName='" + name + "'}";
    }
}
