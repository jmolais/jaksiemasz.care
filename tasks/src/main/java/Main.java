public class Main {
    public static void main(String[] args) {
        System.out.println("Test");
        TeamManager testmanager = new TeamManager("John", "CEO", 3);
        Developer testdev = new Developer("Johnny Dev", "Dev_dude");

        System.out.println(testdev.toJson());
        System.out.println(testmanager.toJson());
        System.out.println(testmanager.toJson());
    }
}