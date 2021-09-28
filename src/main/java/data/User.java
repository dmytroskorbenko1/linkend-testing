package data;

public enum User {
    //TODO: add your user here:
    TEST_USER("", "", "", "", Role.USER);

    private String email;
    private String firstName;
    private String surname;
    private String password;
    private Role role;

    User(String email, String firstName, String surname, String password, Role role) {
        this.email = email;
        this.firstName = firstName;
        this.surname = surname;
        this.password = password;
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getFullName() {
        return firstName + " " + surname;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }
}
