import com.google.common.base.Charsets;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class PersonFactoryResources {
    public static List<String> getFirstNamesList() throws IOException {
        List<String> firstNamesList = Files.readLines(new File("src/main/java/data/first-names.txt"), Charsets.UTF_8);
        return firstNamesList;
    }

    public static List<String> getMaleFirstNamesList() throws IOException {
        List<String> maleFirstNamesList = Files.readLines(new File("src/main/java/data/male-first-names.txt"), Charsets.UTF_8);
        return maleFirstNamesList;
    }

    public static List<String> getFemaleFirstNamesList() throws IOException {
        List<String> femaleFirstNamesList = Files.readLines(new File("src/main/java/data/female-first-names.txt"), Charsets.UTF_8);
        return femaleFirstNamesList;
    }

    public static List<String> getSurnamesList() throws IOException {
        List<String> surnamesList = Files.readLines(new File("src/main/java/data/surnames.txt"), Charsets.UTF_8);
        return surnamesList;
    }

    public static List<String> getEmailDomainsList() throws IOException {
        List<String> emailDomainsList = Files.readLines(new File("src/main/java/data/email-domains.txt"), Charsets.UTF_8);
        return emailDomainsList;
    }
}
