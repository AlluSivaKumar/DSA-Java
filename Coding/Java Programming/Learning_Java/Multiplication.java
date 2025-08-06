public class Multiplication {
    public static int multiply(int a, int b) 
    {
        int result = 0;
        while (b > 0) {
            if ((b & 1) == 1) {
                result += a;
            }
            a <<= 1;
            b >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int product = multiply(a, b);
        System.out.println("The product of " + a + " and " + b + " is " + product);
    }
}