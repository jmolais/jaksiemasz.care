import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //Company.NLevelRandomCompany(2, 3); //Creates a randomly generated company assigned to a CEO TeamManager without assigning tasks;

        TeamManager ceo = Company.NLevelRandomCompanyWithTasks(2, 2, 3); //Creates a randomly generated company assigned to a ceo TeamManager, then prints it nicely.

        System.out.println("--------");

        ceo.printManagerDeepWithReport(); //Other possibility: ceo.printManagerDeep(), allows  for printing without looking into assigned tasks.
    }
}
