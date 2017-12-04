package task;

public class Main {
    public static void main(String[] args) {
        System.out.println("Examples of few created Person objects (some with legal input data, some not), data serialization done with JSON:");
        Person theTestDude = new Person("Good", "Boye", "good.boye@notyourbusiness.com");
        System.out.println(theTestDude.toString());

        Person theGuyWithANumberInHisName = new Person("J0hn", "Doe", "how.is.you@howareyou.care");
        System.out.println(theGuyWithANumberInHisName.toString());

        theGuyWithANumberInHisName = new Person("Mary-Sue", "D'Amore-Bzik", "ihaveanumber0@howareyou.care");
        System.out.println(theGuyWithANumberInHisName.toString());

        theGuyWithANumberInHisName = new Person("Johnny L.", "D'Amore, Jr.", "hihave,der@howareyou.com.pl");
        System.out.println(theGuyWithANumberInHisName.toString());

        theGuyWithANumberInHisName = new Person("George R.R.R.R.R.", "Martin", "do_ggy@-.pl");
        System.out.println(theGuyWithANumberInHisName.toString());

        theGuyWithANumberInHisName = new Person("Ihave Twonames", " Andabadlastname", "_who.are.you@who.who");
        System.out.println(theGuyWithANumberInHisName.toString());

        theGuyWithANumberInHisName = new Person("-Ihaveabadname", " Andabadlastname", "how.is.you@7gag.boop");
        System.out.println(theGuyWithANumberInHisName.toString());

        System.out.println("\nDone.");
    }


}

