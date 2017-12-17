public abstract class EmployeeAbstract implements Employee {
    private final String name;
    private final String role;

    public EmployeeAbstract(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRole() {
        return role;
    }

}
