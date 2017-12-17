import java.util.List;

public class Report {
    private List<TaskReport> listOfTaskReports;
    private  Employee employee;
    private static Employee employeesBoss = null;

    public Report(Employee employee) {
        this.employee = employee;
        listOfTaskReports = employee.getCurrentTasks();
    }

    public String printReport() {
        if (employeesBoss != employee.getBoss()) {
            employeesBoss = employee.getBoss();
            String reportContent = this.employee.getBoss().getName() + ": \n\t" + this.employee.getName() + ": \n";
            for (TaskReport task : listOfTaskReports) {
                reportContent += "\t\t" + (task.printTaskReport() + "\n");
            }
            return reportContent;
        }
        else {
            String reportContent = "\t" + this.employee.getName() + ": \n";
            for (TaskReport task : listOfTaskReports) {
                reportContent += "\t\t" + (task.printTaskReport() + "\n");
            }
            return reportContent;
        }
    }
}
