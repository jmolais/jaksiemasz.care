public abstract class EmployeeAbstract extends Person implements Employee {
    String role;

    public EmployeeAbstract(Name name, String email, Country country, Sex sex, String role) {
        super(name, email, country, sex);
        this.role = role;
    }

    public EmployeeAbstract(String role) {
        super();
        this.role = role;
    }

    void castPersonToEmployee(Person person, String role) {
        this.setName(person.getName());
        this.setEmail(person.getEmail());
        this.setCountryOfOrigin(person.getCountryOfOrigin());
        this.setSex(person.getSex());
        this.setRole(role);
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
