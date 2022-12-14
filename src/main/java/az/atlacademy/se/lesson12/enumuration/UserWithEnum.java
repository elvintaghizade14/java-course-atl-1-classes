package az.atlacademy.se.lesson12.enumuration;

public class UserWithEnum {

    private String name;
    private UserRoleEnum role;

    public UserWithEnum(String name, UserRoleEnum role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserRoleEnum getRole() {
        return role;
    }

    public void setRole(UserRoleEnum role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "{name='" + name + "', role=" + role.toString() + "}";
    }

}
