import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //For debugging purposes:
        for (int i = 0; i < 5; i++) {
            Person p = PersonFactory.randomPerson();
            System.out.println(p);
        }
        Person p = new Person();
        System.out.println(p);

        Developer dev = new Developer(
                new Name("John", "Godson"),
                "sibidibipapa@gogo.com",
                new Country("Proland"),
                Sex.MALE,
                "A thingy developer"
        );
        System.out.println(dev);

        Developer dev2 = new Developer("A thingy developer");
        System.out.println(dev2);
    }


}
