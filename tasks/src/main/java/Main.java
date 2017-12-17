public class Main {
    public static void main(String[] args) {
        //These are for testing purposes:
        System.out.println("THESE ARE FOR TESTING PURPOSES:");
        TeamManager testmanager = new TeamManager("John The Chief", "CEO", 5);

        Developer testdev = new Developer("Johnny Dev", "Dev_dude");
        testmanager.hire(testdev);

        testdev.assign(new Task("Some thingy"));
        testdev.assign(new Task("Some thingy 2", 3));
        testdev.assign(new Task("Some other thingy 3", 5));

        Developer testdev2 = new Developer("Kimmy Dev", "Dev_lady");

        testmanager.hire(testdev2);
        testdev2.assign(new Task("Some thingy 4"));
        testdev2.assign(new Task("Not a thingy 2", 3));
        testdev2.assign(new Task("Different thingy 3", 5));

        TeamManager testmanager2 = new TeamManager("Jimmy The Chief", "CE2", 3);
        testmanager.hire(testmanager2);
        Developer testdev3 = new Developer("Jimmy Dev", "Dev_Baby");

        testmanager2.hire(testdev3);
        testdev3.assign(new Task("Some thingy 4"));
        testdev3.assign(new Task("Not a thingy 2", 3));
        testdev3.assign(new Task("Different thingy 3", 5));

        testmanager.printReports();
    }
}