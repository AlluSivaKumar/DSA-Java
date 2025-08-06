import java.util.Scanner;
//Nested Loops
//outer loop -- rows
//inner loop --coloums

public class PatternOne {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}