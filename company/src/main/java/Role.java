import com.google.common.base.Charsets;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Role {
    public static List<String> getRandomDeveloperRolesList() throws IOException {
        List<String> getRandomDeveloperRolesList = Files.readLines(new File("src/main/java/data/developer-roles.txt"), Charsets.UTF_8);
        return getRandomDeveloperRolesList;
    }

    public static List<String> getRandomTeamManagerRolesList() throws IOException {
        List<String> teamManagerRolesList = Files.readLines(new File("src/main/java/data/teammanager-roles.txt"), Charsets.UTF_8);
        return teamManagerRolesList;
    }

    public static String getRandomDeveloperRole() throws IOException {
        return PersonFactoryRandomMembers.randomListElement(getRandomDeveloperRolesList());
    }

    public static String getRandomTeamManagerRole() throws IOException {
        return PersonFactoryRandomMembers.randomListElement(getRandomTeamManagerRolesList());
    }
}
