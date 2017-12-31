import java.io.IOException;
import java.util.List;
import java.util.Random;

public class PersonFactoryRandomMembers {

    public static String randomListElement(List<String> list) {
        Random randomGenerator = new Random();
        int index = randomGenerator.nextInt(list.size());
        return (list.get(index));
    }

    public static String randomFirstName() throws IOException {
        return randomListElement(PersonFactoryResources.getFirstNamesList());
    }

    public static String randomMaleFirstName() throws IOException {
        return randomListElement(PersonFactoryResources.getMaleFirstNamesList());
    }

    public static String randomFemaleFirstName() throws IOException {
        return randomListElement(PersonFactoryResources.getFemaleFirstNamesList());
    }

    public static String randomSurname() throws IOException {
        return randomListElement(PersonFactoryResources.getSurnamesList());
    }

    public static String randomEmailDomain() throws IOException {
        return randomListElement(PersonFactoryResources.getEmailDomainsList());
    }
}
