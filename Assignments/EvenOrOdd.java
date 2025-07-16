import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        even(num);
    }

    static void even(int num)
    {
        if(num % 2 == 0)
        {
            System.out.println("Even Number...");
        }
        else
        {
            System.out.println("Odd Number...");
        }
    }
}