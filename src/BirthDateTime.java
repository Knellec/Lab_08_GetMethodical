import java.util.Scanner;
public class BirthDateTime
{
    public static void main (String[] args)
    {
        //Declare variables
        Scanner in = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int day = 0;
        int hours = 0;
        int minutes = 0;

        // get year
        year = SafeInput.getRangedInt(in, "What year were you born (1950-2015)?", 1950, 2015);

        // get month
        month = SafeInput.getRangedInt(in, "What month were you born in (1-12)?", 1, 12);

        // get day
        switch (month)
        {
            case 2:
                day = SafeInput.getRangedInt(in, "What day of the month were you born(1-29)?",1, 29);
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = SafeInput.getRangedInt(in, "What day of the month were you born(1-31)?",1, 31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = SafeInput.getRangedInt(in, "What day of the month were you born(1-30)?",1, 30);
                break;
        }

        // get hours
        hours = SafeInput.getRangedInt(in, "What hour of the day were you born(1-24)?", 1, 24);

        // get minutes
        minutes = SafeInput.getRangedInt(in, "How many minutes into the hour were you born(1-60)?", 1, 60);

        // display results
        System.out.println("Your were born on " + month + "/" + day + "/" + year + " at " + hours + ":" + minutes);
    }
}
