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
        String MNumber = "";
        MNumber = SafeInput.getRegExString(in, "Enter your UC Student M Number", ^(M|m)\\d{5}$);

    }
}
