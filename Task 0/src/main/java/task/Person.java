package task;

import com.google.gson.Gson;

public class Person {
    private String name;
    private String surname;
    private String email;

    Person(String name, String surname, String email) {
        this.name = PersonValidateData.validateName.validate(name);
        this.surname = PersonValidateData.validateName.validate(surname); //PersonValidateData.validate.validateName(surname);
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
