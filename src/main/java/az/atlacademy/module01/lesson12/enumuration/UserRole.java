package az.atlacademy.module01.lesson12.enumuration;

public final class UserRole {

    public static final UserRole STUDENT = new UserRole("STUDENT", 0);
    public static final UserRole TRAINER = new UserRole("TRAINER", 1);
    public static final UserRole LECTURER = new UserRole("LECTURER", 2);

    private final String role;
    private final int ordinal;

    private UserRole(String role, int ordinal) {
        this.role = role;
        this.ordinal = ordinal;
    }

    public String getRole() {
        return role;
    }

    public int getOrdinal() {
        return ordinal;
    }

    @Override
    public String toString() {
        return role;
    }

    public UserRole[] values() {
        return new UserRole[]{STUDENT, TRAINER, LECTURER};
    }

}
