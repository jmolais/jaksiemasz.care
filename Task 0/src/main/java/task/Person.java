package task;

import com.google.gson.Gson;

public class Person {
    private final String name;
    private final String surname;
    private final String email;

    Person(String name, String surname, String email) {
        this.name = PersonValidateData.validateName.validate(name);
        this.surname = PersonValidateData.validateName.validate(surname);
        this.email = PersonValidateData.validateEmail.validate(email);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
