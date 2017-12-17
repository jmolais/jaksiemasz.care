public class TaskReport {
    private Task relatedTask;
    private Employee employeeResponsible;

    public TaskReport(Task relatedTask, Employee employeeResponsible) {
        this.relatedTask = relatedTask;
        this.employeeResponsible = employeeResponsible;
    }

    public String printTaskReport() {
        return employeeResponsible.getName() + ": " + relatedTask.taskName + " | " + relatedTask.unitsOfWork + "h of work on this assignment.";
    }
}
