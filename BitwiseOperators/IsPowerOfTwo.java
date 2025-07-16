package BitwiseOperators;

import java.util.Scanner;

public class IsPowerOfTwo {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isTwoPower(num));
    }
    static boolean isTwoPower(int n)
    {
        return (n & (n-1)) == 0;
    }
}
