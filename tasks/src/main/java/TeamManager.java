import java.util.ArrayList;
import java.util.List;

public class TeamManager extends EmployeeAbstract implements Manager {

    private int maxNumberOfEmployees; //In case you need to do some work on this number; add declaration to the constructor.
    private List<Employee> employeesList;
    private boolean canHire;

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
    public void assign(Task task) {

    }

    @Override
    public Report reportWork() {
        return null;
    }

    @Override
    public void hire(Employee employee) {
        if (canHire()) {
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
