/*
Names that will work:
Good Boye
Mary-Sue D'Amoe
George R.R.R. Marcin
Johnny L. D'Amore, Jr.
Dżony Dąbek-Bzik;

Names that won't work:
Ihave Twonames Andabadlastname
-Ihaveabadname Andabadlastname

Rules for allowed Email input; addreses, they:
1. don't start with anything else than letters or numbers
2. contain only letters, numbers, dots, hyphens and underscores
3. MUST contain "@" and a valid domain name.
*/

public class PersonValidateData {
    public static String validateName(String inputName) {
        try {
            if(isAValidName(inputName)) {
                return inputName;
            }
            else {
                throw new IllegalArgumentException("Invalid input argument: (Name) input data contains illegal symbols.");
            }
        }
        catch (IllegalArgumentException e) {
            return "N/A";
        }
    }

    public static String validateEmail(String inputEmail) {
        try {
            if(isAValidEmail(inputEmail)) {
                return inputEmail;
            }
            else {
                throw new IllegalArgumentException("Invalid input argument: (Email) input data contains illegal symbols.");
            }
        }
        catch (IllegalArgumentException e) {
            return "N/A";
        }
    }

    public static boolean isAValidName(String s) {
        return s.matches("(\\p{L}+[,.]?[ ]?|\\p{L}+['-]?)+[^ ]$");
    }

    public static boolean isAValidEmail(String s) {
        return s.matches("(^[A-Za-z0-9]+[-._A-Za-z0-9]*@[A-Za-z0-9]+[-.A-Za-z0-9]*.[A-Za-z0-9]{2,})");
    }

}