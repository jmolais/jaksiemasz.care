public class Developer extends EmployeeAbstract {

    public Developer(String name, String role) {
        super(name, role);
    }

    @Override
    public void assign(Task task) {

    }

    @Override
    public Report reportWork() {
        return null;
    }


}
