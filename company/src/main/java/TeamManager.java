import java.util.ArrayList;
import java.util.List;

public class TeamManager extends EmployeeAbstract implements Manager {
    private List<Task> taskList = new ArrayList<Task>();
    private Employee boss;
    private boolean isAllowedToHire;
    private int maxNumberOfEmployees; //In case you need to do some work on this number, add declaration to the constructor.
    private List<Employee> employeesList = new ArrayList<Employee>();

    public TeamManager(Name name, String email, Country country, Sex sex, String role, int maxNumberOfEmployees) {
        super(name, email, country, sex, role);
        this.maxNumberOfEmployees = maxNumberOfEmployees;
        isAllowedToHire = true;
    }

    public TeamManager(String role, int maxNumberOfEmployees) {
        super(role);
        this.maxNumberOfEmployees = maxNumberOfEmployees;
        isAllowedToHire = true;
    }

    public TeamManager(String role) {
        super(role);
        this.maxNumberOfEmployees = 99; //the default value
        isAllowedToHire = true;
    }

    public TeamManager() {
        super("N/A");
        this.maxNumberOfEmployees = 0;
        isAllowedToHire = false;
    }

    public TeamManager(Person person, String role, int maxNumberOfEmployees) {
        super(role);
        this.setName(person.getName());
        this.setEmail(person.getEmail());
        this.setCountryOfOrigin(person.getCountryOfOrigin());
        this.setSex(person.getSex());
        this.maxNumberOfEmployees = maxNumberOfEmployees;
        isAllowedToHire = true;
    }

    public TeamManager(Person person, String role) {
        super(role);
        this.setName(person.getName());
        this.setEmail(person.getEmail());
        this.setCountryOfOrigin(person.getCountryOfOrigin());
        this.setSex(person.getSex());
        this.maxNumberOfEmployees = 99; //Just a default value.
        isAllowedToHire = true;
    }

    public void forceHire(Employee employee) {
        if (!canHire()) {
            this.maxNumberOfEmployees = this.employeesList.size() + 1;
            isAllowedToHire = true;
        }
        this.hire(employee);
    }

    public static void printChevrons(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print(">");
        }
    }

    public void printTeamManager() {
        if (this.getBoss() == null) {
            System.out.println("> #" + this.getName() + "# (" + this.getRole() + ")");
        } else {
            System.out.println("> #" + this.getName() + "# (" + this.getRole() + "), supervisor: " + getBoss().getName());
        }
    }

    public void printTeamManagerWithDepth(int depth) {
        printChevrons(depth);
        printTeamManager();
    }

    public void printManagerDeep() {
        this.printManagerDeep(0);
    }

    public void printManagerDeep(int depth) {
        this.printTeamManagerWithDepth(depth);
        for (Employee employee : this.employeesList) {
            if (employee instanceof TeamManager) {
                ((TeamManager) employee).printManagerDeep(depth + 1);
            }
            if (employee instanceof Developer) {
                ((Developer) employee).printDeveloperWithDepth(depth + 1);
            }
        }
    }

    public void printManagerDeepWithReport() {
        this.printManagerDeepWithReport(0);
    }

    public void printManagerDeepWithReport(int depth) {
        this.printTeamManagerWithDepth(depth);
        System.out.println(this.reportWork() + "\n");
        for (Employee employee : this.employeesList) {
            if (employee instanceof TeamManager) {
                ((TeamManager) employee).printManagerDeepWithReport(depth + 1);
            }
            if (employee instanceof Developer) {
                ((Developer) employee).printDeveloperWithDepthWithReport(depth + 1);
            }
        }
    }

    @Override
    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String reportWork() { //TODO
        return (new Report(this).reportContent);
    }

    @Override
    public List<Task> getTaskList() {
        return taskList;
    }

    @Override
    public void assign(Task task) {
        System.out.println("[ASSIGNED] " + this.getName() + ", TeamManager: " + task.nameOfTheTask + " (" + task.unitsOfWork + "h of work)");
        taskList.add(task);
    }

    @Override
    public void setBoss(Employee employee) {
        boss = employee;
    }

    @Override
    public Employee getBoss() {
        return boss;
    }

    @Override
    public void hire(Employee employee) {
        if (this.canHire() && employeesList.size() < maxNumberOfEmployees) {
            employeesList.add(employee);
            employee.setBoss(this);
            System.out.println("[HIRED] " + this.getName() + ", TeamManager: hired " + employee.getName() + ".");
        } else {
            System.out.println("[HIRING FAILED] " + this.getName() + ", TeamManager: can't hire new employees.");
        }
    }

    @Override
    public void fire(Employee employee) {
        if (employeesList.contains(employee)) {
            employee.setBoss(null);
            employeesList.remove(employee);
            System.out.println("[FIRED] " + this.getName() + ", TeamManager: fired " + employee.getName() + ".");
        }
    }

    @Override
    public boolean canHire() {
        if (employeesList.size() < maxNumberOfEmployees) {
            return isAllowedToHire;
        } else {
            return false;
        }
    }

    @Override
    public boolean isCEO() {
        if (getBoss() == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<Employee> getEmployees() {
        return employeesList;
    }
}
