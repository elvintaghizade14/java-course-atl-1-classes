package az.atlacademy.se.lesson12.enumuration;

public class UserWithRole {

    private String name;
    private UserRole role;

    public UserWithRole(String name, UserRole role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return String.format("{name='%s', role='%s'}", name, role);
    }

}
