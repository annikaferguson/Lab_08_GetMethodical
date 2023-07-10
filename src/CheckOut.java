import java.util.Scanner;
public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        boolean moreItems = false;
        boolean done = false;

        if(moreItems = true)
        {
            done = true;
            do {
                itemPrice = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 10.00);
                moreItems = SafeInput.getYNConfirm(in, "Do you have more items?");
            } while (!done);
        }

        System.out.printf("The total is: %6.2f", itemPrice);

    }
}
