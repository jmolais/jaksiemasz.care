import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 100; i++) {
            Person p = PersonFactory.randomPerson();
            System.out.println(p);
        }
    }
}
