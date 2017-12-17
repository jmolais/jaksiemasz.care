public class Task {
    String taskName;
    int unitsOfWork;

    public Task(String taskName) {
        this.taskName = taskName;
        this.unitsOfWork = 0;
    }

    public Task(String taskName, int unitsOfWorkAlreadyDone) {
        this.taskName = taskName;
        this.unitsOfWork = unitsOfWorkAlreadyDone;
    }

    public void addUnitsOfWorkCompleted(int workDone) {
        unitsOfWork += workDone;
    }
}
