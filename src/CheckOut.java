import java.util.Scanner;
public class CheckOut
{
    public static void main(String[] args)
    {
        // declare variables
        Scanner in = new Scanner(System.in);
        double price = 0;
        double totalCost = 0;

        //get ranged input for price
        do
        {
            price = SafeInput.getRangedDouble(in, "Enter the price of your item($0.50-$10)", 0.50, 10);
            totalCost = totalCost + price;
        }
        while (SafeInput.getYNConfirm(in, "Would you like to add another item(Y/N)?")); // loop while they ask to continue

        // display total
        System.out.println("Price:");
        System.out.printf("%.2f", totalCost);
    }
}
