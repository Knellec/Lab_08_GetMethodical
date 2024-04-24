import java.util.Scanner;
public class CtoFTableDisplay
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        double celcius = 0;

        do
        {
            celcius = SafeInput.getDouble(in,"Enter a temperature in celcius");
            System.out.print("C" + "           " + "F");
            System.out.println();
            System.out.print(celcius + "           " + CtoF(celcius));
        }
        while (SafeInput.getYNConfirm(in, "Would you like to enter another temperature?"));


    }
    public static double CtoF(double Celcius)
    {
        double farenheit = 0;

        // convert
        farenheit = Celcius * (9/5) + 32;

        return farenheit;
    }
}
