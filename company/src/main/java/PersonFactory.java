import java.io.IOException;
import java.util.Random;

public class PersonFactory {
    public static Person randomMale() throws IOException {
        String name = PersonFactoryRandomMembers.randomMaleFirstName();
        String surname = PersonFactoryRandomMembers.randomSurname();
        Person person = new Person(name, surname, Email.generateEmail(name, surname), Country.randomCountry(), Sex.MALE);
        return person;
    }

    public static Person randomFemale() throws IOException {
        String name = PersonFactoryRandomMembers.randomFemaleFirstName();
        String surname = PersonFactoryRandomMembers.randomSurname();
        Person person = new Person(name, surname, Email.generateEmail(name, surname), Country.randomCountry(), Sex.FEMALE);
        return person;
    }

    public static Person randomPerson() throws IOException {
        int a = (new Random())
                .nextInt(2);
        Person person = null;
        switch (a) {
            case 0:
                person = randomMale();
                break;
            case 1:
                person = randomFemale();
                break;
        }
        return person;
    }
}
