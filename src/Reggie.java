import java.util.Scanner;
public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //Social Security Number
        String SSN = "";

        SSN = SafeInput.getRegExString(in, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your social security number is: " + SSN);

        //UC Student M Number
        String mNumber = "";
        mNumber = SafeInput.getRegExString(in, "Enter your UC Student M Number", "^(M|m)\\d{8}$");
        System.out.println("Your M Number is: " + mNumber);

        //Menu Choice (Open, Save, View, Quit)
        String menuChoice = "";
        menuChoice = SafeInput.getRegExString(in, "Enter your choice: Open (O), Save (S), View(V), or Quit (Q)", "^[OoSsVvQq]$");
        if(menuChoice.equalsIgnoreCase("O"))
        {
            System.out.println("You have selected Open");
        } else if(menuChoice.equalsIgnoreCase("S"))
        {
            System.out.println("You have selected Save");
        } else if(menuChoice.equalsIgnoreCase("V"))
        {
            System.out.println("You have selected View");
        } else if(menuChoice.equalsIgnoreCase("Q"))
        {
            System.out.println("You have selected Quit");
        } else {
            System.out.println("Invalid input. Please enter O, S, V, or Q.");
        }
    }
}
