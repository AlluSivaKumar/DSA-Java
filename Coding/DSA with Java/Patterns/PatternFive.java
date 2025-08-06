import java.util.Scanner;

public class PatternFive {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
