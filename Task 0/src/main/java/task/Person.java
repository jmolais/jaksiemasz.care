package task;

import com.google.gson.Gson;

public class Person implements Comparable<Person>{
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

    public void printNicely() {
        System.out.printf("%-14s %2s %-20s %2s %-34s \n", this.getName(), "|", this.getSurname(), "|", this.getEmail());
    }

    public void printNicely(String spacer) {
        System.out.printf("%-14s %2s %-20s %2s %-34s \n", this.getName(), spacer, this.getSurname(), spacer, this.getEmail());
    }

    @Override
    public String toString(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    @Override
    public int compareTo(Person o) {
        int nameCompared = name.compareTo(o.name);
        int surnameCompared = surname.compareTo(o.surname);
        if (nameCompared == 0) {
            return surname.compareTo(o.surname);
        }
        else if (surnameCompared == 0) {
            return email.compareTo(o.email);
        }
        else {
            return nameCompared;
        }
    }
}
