import java.util.Scanner;

public class UpdatedSwitchCase 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        String result=" ";
        result = switch (day)
        {
            case "saturday","sunday" -> "8 AM";
            default -> "6 AM";
        };
        System.out.println(result);
    }
}
