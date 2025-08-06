import java.util.*;

public class PatternFour 
{
   public static void main(String[] args) 
    {
         @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=0;i<num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}


