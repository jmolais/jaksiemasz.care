public class Name {
    private String firstName;
    private String surname;

    public Name(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    public static String validateName(String inputName) {
        try {
            if (isAValidName(inputName)) {
                return inputName;
            } else {
                throw new IllegalArgumentException("Invalid input argument: (Name) input data contains illegal symbols.");
            }
        } catch (IllegalArgumentException e) {
            return "N/A";
        }
    }

    public static boolean isAValidName(String s) {
        return s.matches("(\\p{L}+[,.]?[ ]?|\\p{L}+['-]?)+[^ ]$");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        String returnedName = firstName;
        StringBuilder sb = new StringBuilder(returnedName);
        sb.append(" ");
        sb.append(surname);
        return sb.toString();
    }
}
