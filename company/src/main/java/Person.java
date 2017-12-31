import com.google.gson.Gson;

public class Person  implements Comparable<Person> {
    private final String name;
    private final String surname;
    private final String email;
    private final Sex sex;
    private final Country countryOfOrigin;

    Person() {
        this.name = "John";
        this.surname = "Doe";
        this.email = "nonexistent@anonymous.com";
        this.countryOfOrigin = new Country("NowhereLand");
        this.sex = Sex.MALE;
    }

    Person(String name, String surname, String email, Country country, Sex sex) {
        this.name = PersonValidateData.validateName(name);
        this.surname = PersonValidateData.validateName(surname);
        this.email = PersonValidateData.validateEmail(email);
        this.countryOfOrigin = country;
        this.sex = sex;
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
