import java.util.Scanner;

public class MaximumOfThree 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three positive numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(max(a,b,c));
    }

    static int max(int a, int b, int c)
    {
        if(a>b && a>c)
        {
            return a;
        }
        if (b>c) 
        {
            return b;
        } 
        else 
        {
            return c;
        }
    }
}
