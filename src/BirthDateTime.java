import java.util.Scanner;
public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthYear = 0;
        int birthMonth = 0;
        int birthDay = 0;
        int birthHour = 0;
        int birthMinute = 0;

        birthYear = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);
        birthMonth = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);

        switch(birthMonth) {
            // January
            case 1:
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1, 31);
                break;
            // February
            case 2:
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1, 28);
                break;

            // March
            case 3:
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1, 31);
                break;

            // April
            case 4:
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1, 30);
                break;

            // May
            case 5:
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1, 31);
                break;

            // June
            case 6:
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1, 30);
                break;

            // July
            case 7:
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1, 31);
                break;

            // August
            case 8:
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1, 31);
                break;

            // September
            case 9:
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1, 30);
                break;

            // October
            case 10:
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1, 31);
                break;

            // November
            case 11:
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1, 30);
                break;

            // December
            case 12:
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1, 31);
                break;
        }

        birthHour = SafeInput.getRangedInt(in, "Enter your birth hour", 1, 24);
        birthMinute = SafeInput.getRangedInt(in, "Enter your birth minutes", 1, 59);

        System.out.println("\nYour birth year is: " + birthYear + "\nYour birth month is: " + birthMonth + "\nYour birth day is: " + birthDay + "\nYour birth hour is: " + birthHour + "\nYour birth minute is: " + birthMinute);

    }
}
