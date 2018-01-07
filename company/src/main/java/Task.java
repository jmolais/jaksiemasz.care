import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class Task {
    String nameOfTheTask;
    int unitsOfWork;

    public Task(String nameOfTheTask, int unitsOfWork) {
        this.nameOfTheTask = nameOfTheTask;
        this.unitsOfWork = unitsOfWork;
    }

    public static List<String> getRandomDeveloperTasksList() throws IOException {
        List<String> developerTasksList = Files.readLines(new File("src/main/java/data/developer-tasks.txt"), Charsets.UTF_8);
        return developerTasksList;
    }

    public static List<String> getRandomTeamManagerTasksList() throws IOException {
        List<String> teamManagerTasksList = Files.readLines(new File("src/main/java/data/developer-tasks.txt"), Charsets.UTF_8);
        return teamManagerTasksList;
    }

    public static String getRandomDeveloperTaskName() throws IOException {
        return PersonFactoryRandomMembers.randomListElement(getRandomDeveloperTasksList());
    }

    public static String getRandomTeamManagerTaskName() throws IOException {
        return PersonFactoryRandomMembers.randomListElement(getRandomTeamManagerTasksList());
    }

    public static Task getRandomDeveloperTask() throws IOException {
        Random r = new Random();
        return new Task(getRandomDeveloperTaskName(), r.nextInt(100));
    }

    public static Task getRandomTeamManagerTask() throws IOException {
        Random r = new Random();
        return new Task(getRandomTeamManagerTaskName(), r.nextInt(100));
    }

    static void assignRandomTasks(Employee employee, int numberOfTasksToAssign) throws IOException {
        if (employee instanceof Developer) {
            for (int i = 0; i < numberOfTasksToAssign; i++) {
                employee.assign(getRandomDeveloperTask());
            }
        } else if (employee instanceof TeamManager) {
            for (int i = 0; i < numberOfTasksToAssign; i++) {
                employee.assign(getRandomTeamManagerTask());
            }
        }
    }

    static void assignRandomTasksWithRandomNumber(Employee employee, int maxNumberOfTasksToAssign) throws IOException {
        Random r = new Random();
        Task.assignRandomTasks(employee, r.nextInt(maxNumberOfTasksToAssign + 1));
    }

    static void assignTasksToCompany(Employee chief, int maxNumberOfTasks) throws IOException {
//       Random r = new Random();
//        assignRandomTasks(chief, r.nextInt(maxNumberOfTasks));

        assignRandomTasksWithRandomNumber(chief, maxNumberOfTasks);

        if (chief instanceof TeamManager) {
            for (Employee employee : ((TeamManager) chief).getEmployees()) {
                assignTasksToCompany(employee, maxNumberOfTasks);
            }
        }
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}

//        int index = randomGenerator.nextInt(list.size());
//        return (list.get(index));