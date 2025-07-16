package ConditionalStatements;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Positive or Negative Number :");
        int num = sc.nextInt();

        if(num >= 0)
        {
            System.out.println("Positive Number");
        }
        else
        {
            System.out.println("Negative Number");
        }
    }
}
