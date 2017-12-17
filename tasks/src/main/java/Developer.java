import java.util.ArrayList;
import java.util.List;

public class Developer extends EmployeeAbstract {
    private List<Task> taskList;
    private Employee employeesBoss;

    public Developer(String name, String role) {
        super(name, role);
        employeesBoss = null;
        taskList = new ArrayList<>();
    }

    public void workOnTask(Task task, int amountOfWork) {
        task.addUnitsOfWorkCompleted(amountOfWork);
    }

    public void finishTask(Task task) {
        taskList.remove(task);
    }

    @Override
    public List<TaskReport> getCurrentTasks() {
        List<TaskReport> returnedListOfTaskReports = new ArrayList<>();
        for (Task task : taskList) {
            returnedListOfTaskReports.add(new TaskReport(task, this));
        }
        return returnedListOfTaskReports;
    }

    @Override
    public void assign(Task task) {
        taskList.add(task);
    }

    @Override
    public List<Report> reportWork() {
        List<Report> listWithSingleReport = new ArrayList<>(1);
        listWithSingleReport.add(new Report(this));
        return listWithSingleReport;
    }

    @Override
    public void assignBoss(Employee boss) {
        employeesBoss = boss;
    }

    @Override
    public Employee getBoss() {
        return employeesBoss;
    }


}
