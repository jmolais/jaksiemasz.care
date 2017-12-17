import com.google.gson.Gson;

import java.util.List;

public interface Employee {
    String getName();
    String getRole();
    List<TaskReport> getCurrentTasks();
    void assign(Task task);
    List<Report> reportWork();
    void assignBoss(Employee boss);
    Employee getBoss();

    default void printReports() {
        for ( Report report : reportWork() ) {
            System.out.println(report.printReport());
        }
    }

    default String toJson() {
        return new Gson().toJson(this);
    }
}
