import com.google.common.base.Charsets;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class Country {
    private final String countryName;

    public Country(String countryName) {
        this.countryName = countryName;
    }

    public static List<String> getCountryNames() throws IOException {
        List<String> countryNames = Files.readLines(new File("src/main/java/data/countries.txt"), Charsets.UTF_8);
        return countryNames;
    }

    public static String randomCountryName() throws IOException {
        Random r = new Random();
        int index = r.nextInt(getCountryNames().size());
        return (getCountryNames().get(index));
    }

    public static Country randomCountry() throws IOException {
        return (new Country(randomCountryName()));
    }
}
