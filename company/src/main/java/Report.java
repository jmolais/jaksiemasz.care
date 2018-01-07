public class Report {
    int numberOfHoursWorkedTotal; //to be returned to reportWork() method.
    String reportContent = "";

    public Report(Employee employee) {
        //reportContent += ( "(WORK REPORT: " + employee.getName() + ")\n");

        if (employee.getTaskList().isEmpty()) {
            reportContent += "No tasks assigned.\n";
        }

        for (Task task : employee.getTaskList()) {
            numberOfHoursWorkedTotal += task.unitsOfWork;
            reportContent += ("- " + task.nameOfTheTask + " (" + task.unitsOfWork + "h)\n");
        }
        reportContent += ("TOTAL: " + numberOfHoursWorkedTotal + "h.");
    }
}
