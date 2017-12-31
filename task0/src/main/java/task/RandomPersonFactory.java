package task;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class RandomPersonFactory {
    public static List<String> getFirstNamesList() throws IOException {
        List<String> firstNamesList = Files.readLines(new File("src/main/java/task/data/first-names.txt"), Charsets.UTF_8);
        return firstNamesList;
    }

    public static List<String> getSurnamesList() throws IOException {
        List<String> surnamesList = Files.readLines(new File("src/main/java/task/data/surnames.txt"), Charsets.UTF_8);
        return surnamesList;
    }

    public static List<String> getEmailDomainsList() throws IOException {
        List<String> emailDomainsList = Files.readLines(new File("src/main/java/task/data/email-domains.txt"), Charsets.UTF_8);
        return emailDomainsList;
    }

    public static String randomListElement(List<String> list) {
         Random randomGenerator = new Random();
         int index = randomGenerator.nextInt(list.size());
         return (list.get(index));
    }

    public static String randomFirstName() throws IOException {
        return randomListElement(getFirstNamesList());
    }

    public static String randomSurname() throws IOException {
        return randomListElement(getSurnamesList());
    }

    public static String randomEmailDomain() throws IOException {
        return randomListElement(getEmailDomainsList());
    }

    public static Person randomPerson() throws IOException {
        String name = randomFirstName();
        String surname = randomSurname();
        Person person = new Person(name, surname, PersonEmailGenerator.generateEmail(name, surname));
        return person;
    }
}
