import com.google.gson.Gson;

public interface Employee {
    String getName();
    String getRole();
    void assign(Task task);
    Report reportWork();

    default String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
