import java.util.Scanner;

public class C116ReverseAString 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings({ "unused", "resource" })
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String :");
        String str = sc.nextLine();
        String rev = "";
        
        for (int i = str.length()-1; i >= 0; i--) 
        {
            rev = rev + str.charAt(i);
        }
        System.out.println("Reverse of the string is :" + rev);
    }
}
