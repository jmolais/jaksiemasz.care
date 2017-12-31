package task;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        final int numberOfPeopleToCreate = 500;
        List<Person> listOfRandomPeople = new ArrayList<Person>();

        for (int i = 0; i < numberOfPeopleToCreate; i++) {
            listOfRandomPeople.add(RandomPersonFactory.randomPerson());
        }

        Collections.sort(listOfRandomPeople);

        for(Person person : listOfRandomPeople) {
            person.printNicely();
        }
    }
}