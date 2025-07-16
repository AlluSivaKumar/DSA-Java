package ConditionalStatements;

import java.util.Scanner;

public class SwitchCase 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        String fruit = sc.next();

        switch (fruit.toLowerCase()) {
            case "mango":
                System.out.println("King of Fruits");
                break;
            
            case "apple":
                System.out.println("Healthy Fruit");
                break;
        
            case "banana":
                System.out.println("Calories High Fruit");
                break;

            default:
                System.out.println("It is Not a fruit");
        }
    }
}

