public abstract class EmployeeAbstract extends Person implements Employee {
    private final String role;

    public EmployeeAbstract(Name name, String email, Country country, Sex sex, String role) {
        super(name, email, country, sex);
        this.role = role;
    }

    public EmployeeAbstract(String role) {
        super();
        this.role = role;
    }

    @Override
    public Name getName() {
        return name;
    }

    @Override
    public String getRole() {
        return role;
    }
}
