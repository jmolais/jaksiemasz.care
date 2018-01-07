import com.google.gson.Gson;

import java.util.List;

public interface Employee {
    Name getName();

    String getRole();

    void setRole(String role);

    String reportWork(); //TODO: Delete comment, Zwraca ilość pracy wykonana przez pracownika

    List<Task> getTaskList();

    void assign(Task task);

    void setBoss(Employee employee);

    Employee getBoss();

    default String toJson() {
        return new Gson().toJson(this);
    } //Just for debugging purposes. In some cases it will throw exception, for example with
    // TeamManagers who hired any employees because of the circular reference regarding TeamManager's hire() method.
}
