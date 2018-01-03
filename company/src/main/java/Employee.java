import com.google.gson.Gson;

public interface Employee {
    Name getName();

    String getRole();

    Report reportWork(Employee employee); //TODO: Delete comment, Zwraca ilość pracy wykonana przez pracownika

    void assign(Task task); //TODO: Delete Wypisuje przy tym co robi np. "Developer 'implementing new bug: x unistOfWork'. "

    void setBoss(Employee employee);

    Employee getBoss();

    default String toJson() {
        return new Gson().toJson(this);
    } //Just for debugging purposes.
}
