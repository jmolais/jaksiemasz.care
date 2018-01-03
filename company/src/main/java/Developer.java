public class Developer extends EmployeeAbstract {
    public Developer(Name name, String email, Country country, Sex sex, String role) {
        super(name, email, country, sex, role);
    }

    public Developer(String role) {
        super(role);
    }

    public Developer() {
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
}
