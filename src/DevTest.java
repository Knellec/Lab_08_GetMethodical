import java.util.Scanner;
public class DevTest
{
    public static void main(String[] args)
    {

        // declare variables
        Scanner in = new Scanner(System.in);
        String message = "";
        boolean YN = false;
        String name = "";
        int intInput = 0;
        int low = 0;
        int high = 0;
        double dblInput = 0;

        //getNonZeroLenString test
        message = "Enter your name";
        name = SafeInput.getNonZeroLenString(in, message);

        //getInt test
        message = "Enter an integer";
        intInput = SafeInput.getInt(in, message);

        System.out.println(intInput);

        intInput = 0; // clear input

        //getDouble test
        message = "Enter a double";
        dblInput = SafeInput.getDouble(in, message);

        System.out.println(dblInput);

        dblInput = 0; // clear input

        //getRangedInt test
        message = "Enter a integer from 1-10";
        low = 1;
        high = 10;
        intInput = SafeInput.getRangedInt(in, message, low, high);

        System.out.println(intInput);

        // clear input
        intInput = 0;

        //getRangedDouble test
        message = "Enter a double from 1-10";
        low = 1;
        high = 10;
        dblInput = SafeInput.getRangedDouble(in,message, low, high);

        System.out.println(dblInput);

        // clear input
        dblInput = 0;

        //getYNConfirm test
        message = "Are you cool(y/n)?";
        YN = SafeInput.getYNConfirm(in, message);

        System.out.println(YN);


        //getRegExString test
        message = "Enter your phone number";
        String pattern = "\\d{3}-\\d{3}-\\d{4}";
        String phoneNumber = "";

        phoneNumber = SafeInput.getRegExString(in, message, pattern);

        System.out.println(phoneNumber + " is a valid password.");
    }
}