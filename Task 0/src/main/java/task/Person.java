package task;

import com.google.gson.Gson;

public class Person {
    private String name;
    private String surname;
    private String email;

    //TODO: Validate arguments
    Person(String name, String surname, String email) {
        this.name =  name;
        this.surname = surname;
        this.email = email;
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
