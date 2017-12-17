import java.util.ArrayList;
import java.util.List;

public class TeamManager extends EmployeeAbstract implements Manager {
    private List<Task> taskList;
    private int maxNumberOfEmployees; //In case you need to do some work on this number; add declaration to the constructor.
    private List<Employee> employeesList;
    private boolean canHire;
    private Employee employeesBoss = null;

    public TeamManager(String name, String role, int maxNumberOfEmployees) {
        super(name, role);
        this.canHire = true;
        this.employeesList = new ArrayList<>(maxNumberOfEmployees);
    }

    public TeamManager(String name, String role, int maxNumberOfEmployees, boolean canHire) {
        super(name, role);
        this.canHire = canHire;
        employeesList = new ArrayList<>(maxNumberOfEmployees);
    }

    @Override
    public List<TaskReport> getCurrentTasks() {
        List<TaskReport> listOfEmployeesTaskReports = new ArrayList<>();
        for ( Employee employee : employeesList) {
            listOfEmployeesTaskReports.addAll(employee.getCurrentTasks());
        }
        return listOfEmployeesTaskReports;
    }

    @Override
    public void assign(Task task) {

    }

    @Override
    public List<Report> reportWork() {
        List<Report> listOfEmployeesReports = new ArrayList<>();
        for (Employee employee : employeesList) {
            listOfEmployeesReports.addAll(employee.reportWork());
        }
        return listOfEmployeesReports;
    }

    @Override
    public void assignBoss(Employee boss) {
        employeesBoss = boss;
    }

    @Override
    public Employee getBoss() {
        return null;
    }


    @Override
    public void hire(Employee employee) {
        if (canHire()) {
            employee.assignBoss(this);
            employeesList.add(employee);
        }
    }

    @Override
    public void fire(Employee employee) {

    }

    @Override
    public boolean canHire() {
        return this.canHire;
    }
}
