import java.util.ArrayList;
import java.util.List;

public class Developer extends EmployeeAbstract {
    private List<Task> taskList = new ArrayList<Task>();
    ;
    private Employee boss;

    public Developer(Name name, String email, Country country, Sex sex, String role) {
        super(name, email, country, sex, role);
        boss = null;
        taskList = new ArrayList<>();
    }

    public Developer(String role) {
        super(role);
        boss = null;
        taskList = new ArrayList<>();
    }

    public Developer() {
        super("N/A");
        boss = null;
        taskList = new ArrayList<>();
    }

    Developer(Person person, String role) {
        super(role);
        this.setName(person.getName());
        this.setEmail(person.getEmail());
        this.setCountryOfOrigin(person.getCountryOfOrigin());
        this.setSex(person.getSex());
    }

    public void printDeveloper() {
        if (this.getBoss() == null) {
            System.out.println("> " + this.getName() + " (Dev: " + this.getRole() + "), supervisor: -");
        } else {
            System.out.println("> " + this.getName() + " (Dev: " + this.getRole() + "), supervisor: " + this.getBoss().getName());
        }
    }

    public void printDeveloperWithDepth(int depth) {
        TeamManager.printChevrons(depth);
        printDeveloper();
    }

    public void printDeveloperWithDepthWithReport(int depth) {
        TeamManager.printChevrons(depth);
        printDeveloper();
        System.out.println(this.reportWork() + "\n");
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
        System.out.println("[ASSIGNED] " + this.getName() + ", Developer; " + task.nameOfTheTask + " (" + task.unitsOfWork + "h of work)");
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
}
