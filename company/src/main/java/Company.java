import java.io.IOException;

public class Company {

    static Developer randomDeveloper() throws IOException {
        return new Developer(PersonFactory.randomPerson(), Role.getRandomDeveloperRole());
    }

    static TeamManager randomUpperTeamManager(int numberOfEmployees) throws IOException {
        TeamManager teamManager = new TeamManager(PersonFactory.randomPerson(), Role.getRandomTeamManagerRole());
        for (int i = 0; i < numberOfEmployees; i++) {
            teamManager.hire(randomTeamManager(0));
        }
        return teamManager;
    }

    static void randomUpperManagementTeam(TeamManager teamManager, int numberOfEmployees) throws IOException {
        for (int i = 0; i < numberOfEmployees; i++) {
            teamManager.hire(randomTeamManager(0));
        }
    }

    static TeamManager randomTeamManager(int numberOfEmployees) throws IOException {
        TeamManager teamManager = new TeamManager(PersonFactory.randomPerson(), Role.getRandomTeamManagerRole());
        for (int i = 0; i < numberOfEmployees; i++) {
            teamManager.hire(randomDeveloper());
        }
        return teamManager;
    }

    static void randomDevelopmentTeam(TeamManager teamManager, int numberOfEmployees) throws IOException {
        for (int i = 0; i < numberOfEmployees; i++) {
            teamManager.forceHire(randomDeveloper());
        }
    }

    static TeamManager NLevelRandomBranch(TeamManager chief, int currentDepth, int maxWidth) throws IOException {
        if (currentDepth == 1) {
            randomDevelopmentTeam(chief, maxWidth);
        }
        if (currentDepth > 1) {
            randomUpperManagementTeam(chief, maxWidth);
            for (Employee employee : chief.getEmployees()) {
                if (employee instanceof TeamManager) {
                    NLevelRandomBranch((TeamManager) employee, currentDepth - 1, maxWidth);
                }
            }
        }
        return chief;
    }

    static TeamManager NLevelRandomCompany(TeamManager chief, int currentDepth, int maxWidth) throws IOException {
        NLevelRandomBranch(chief, currentDepth, maxWidth);
        chief.setRole("CEO");
        return chief;
    }

    static TeamManager NLevelRandomCompany(int currentDepth, int maxWidth) throws IOException {
        TeamManager ceo = randomTeamManager(0);
        return NLevelRandomCompany(ceo, currentDepth, maxWidth);
    }

    //With task generating:
    static TeamManager NLevelRandomCompanyWithTasks(int currentDepth, int maxWidth, int maxNumberOfTasks) throws IOException {
        TeamManager ceo = Company.NLevelRandomCompany(currentDepth, maxWidth);
        Task.assignTasksToCompany(ceo, maxNumberOfTasks);
        return ceo;
    }
}