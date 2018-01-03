import java.util.List;

public class TeamManager extends EmployeeAbstract implements Manager {

    public TeamManager(Name name, String email, Country country, Sex sex, String role) {
        super(name, email, country, sex, role);
    }

    public TeamManager(String role) {
        super(role);
    }

    public TeamManager() {
        super("N/A");
    }

    @Override
    public Report reportWork(Employee employee) {
        return null;
    }

    @Override
    public void assign(Task task) {

    }

    @Override
    public void setBoss(Employee employee) {

    }

    @Override
    public Employee getBoss() {
        return null;
    }

    @Override
    public void hire(Employee employee) {

    }

    @Override
    public void fire(Employee employee) {

    }

    @Override
    public boolean canHire() {
        return false;
    }

    @Override
    public List<Employee> getEmployees() {
        return null;
    }
}
