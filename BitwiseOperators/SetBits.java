package BitwiseOperators;

import java.util.Scanner;

public class SetBits {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Integer.toBinaryString(num));
        System.out.println(setbits(num));
    }

    static int setbits(int n)
    {
        int count = 0;
        while(n > 0)
        {
            count++;
            n = n-(n & -n);
        }
        return count;  
    }
}