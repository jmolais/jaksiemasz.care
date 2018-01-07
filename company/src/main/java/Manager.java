import java.util.List;

public interface Manager extends Employee {
    void hire(Employee employee);

    void fire(Employee employee);

    boolean canHire();

    boolean isCEO();

    List<Employee> getEmployees();
}
