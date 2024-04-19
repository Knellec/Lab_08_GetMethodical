import java.util.Scanner;
public class Reggie
{
    public static void main (String[] args)
    {
        // Declare variables
        Scanner in = new Scanner(System.in);
        String ssn = "";
        String mNum = "";
        String menuChoice = "";

        // get input
        SafeInput.getRegExString(in, "Enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$"); // get SSN
        SafeInput.getRegExString(in, "Enter your UC M number", "^(M|m)\\d{5}$"); // get M number

        System.out.println("\nWhat would you like to do? \nOpen(O)\nSave(S)\nView(V)\nQuit(Q)");
        SafeInput.getRegExString(in, "Enter your menu choice", "^[OoSsVvQq]$"); // get menu choice
    }
}
