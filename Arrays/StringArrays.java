package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StringArrays 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        String str[] = new String[4];

        for(int i=0; i<str.length; i++)
        {
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));
    }
}
