package task;

public class Person {
    private String name;
    private String surname;
    private String email;

    Person(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    private String getName() {
        return name;
    }

    private String getSurname() {
        return surname;
    }

    private String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return ">> toString(): Name: " + getName() + ", Surname: " + getSurname() + ", Email: " + getEmail() + ". <<";
    }
}
