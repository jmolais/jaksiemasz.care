import java.io.IOException;
import java.util.Random;

public class Email {
    public static String generateEmail(String name, String surname) throws IOException {
        String randomEmailAddress;
        Random r = new Random();
        char[] specialSymbols = {'-', '_', '.'};
        int randomNumber = r.nextInt(9);
        int specialSymbolRandomizer = r.nextInt(specialSymbols.length - 1);

        name = fixNameAndSurname(name, specialSymbols[specialSymbolRandomizer]);
        surname = fixNameAndSurname(surname, specialSymbols[specialSymbolRandomizer]);

        switch (randomNumber) {
            case 0:
                randomEmailAddress = name + specialSymbols[specialSymbolRandomizer] + surname + "@" + PersonFactoryRandomMembers.randomEmailDomain();
                break;
            case 1:
                randomEmailAddress = surname + specialSymbols[specialSymbolRandomizer] + name + "@" + PersonFactoryRandomMembers.randomEmailDomain();
                break;
            case 2:
                randomEmailAddress = name + surname + "@" + PersonFactoryRandomMembers.randomEmailDomain();
                break;
            case 3:
                randomEmailAddress = surname + name + "@" + PersonFactoryRandomMembers.randomEmailDomain();
                break;
            case 4:
                randomEmailAddress = name + specialSymbols[specialSymbolRandomizer] + surname + (r.nextInt(48) + 50) + "@" + PersonFactoryRandomMembers.randomEmailDomain();
                break;
            case 5:
                randomEmailAddress = surname + specialSymbols[specialSymbolRandomizer] + name + (r.nextInt(48) + 50) + "@" + PersonFactoryRandomMembers.randomEmailDomain();
                break;
            case 6:
                randomEmailAddress = name + surname + (r.nextInt(48) + 50) + "@" + PersonFactoryRandomMembers.randomEmailDomain();
                break;
            case 7:
                randomEmailAddress = surname + name + (r.nextInt(48) + 50) + "@" + PersonFactoryRandomMembers.randomEmailDomain();
                break;
            default:
                randomEmailAddress = surname + specialSymbols[specialSymbolRandomizer] + name + "@" + PersonFactoryRandomMembers.randomEmailDomain();
        }
        randomEmailAddress = randomEmailAddress.toLowerCase();
        return randomEmailAddress;
    }

    private static String fixNameAndSurname(String s, char specialSymbol) {
        if (s.matches(".*[', ].*")) {
            s = s.replace("\'", "");
            s = s.replace(",", "");
            s = s.replace(".'", "");
            s = s.replace(" ", Character.toString(specialSymbol));
        }
        return s;
    }

    public static String validateEmail(String inputEmail) {
        try {
            if (isAValidEmail(inputEmail)) {
                return inputEmail;
            } else {
                throw new IllegalArgumentException("Invalid input argument: (Email) input data contains illegal symbols.");
            }
        } catch (IllegalArgumentException e) {
            return "N/A";
        }
    }

    public static boolean isAValidEmail(String s) {
        return s.matches("(^[A-Za-z0-9]+[-._A-Za-z0-9]*@[A-Za-z0-9]+[-.A-Za-z0-9]*.[A-Za-z0-9]{2,})");
    }
}
