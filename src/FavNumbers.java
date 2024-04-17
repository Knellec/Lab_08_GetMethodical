import java.util.Scanner;
public class FavNumbers
{
    public static void main (String[] args)
    {
        // declare variables
        Scanner in = new Scanner(System.in);
        int favInt = 0;
        double favDbl = 0;

        // get valid input
        favInt = SafeInput.getInt(in, "Enter your favorite integer");
        favDbl = SafeInput.getDouble(in, "Enter your favorite double");

        // display
        System.out.println("Your favorite integer is " + favInt);
        System.out.println("Your favorite double is " + favDbl);
    }
}
