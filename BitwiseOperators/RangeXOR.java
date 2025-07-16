package BitwiseOperators;

public class RangeXOR {
    public static void main(String[] args) 
    {
        //range XOR from a to b
        int a = 3;
        int b = 9;
        System.out.println(Xor(b)^Xor(a-1 ));
    }

    //XOR fron 0 to n
    static int Xor(int a)
    {
        if (a % 4 == 0) {
            return a;
        }
        if (a % 4 == 1) {
            return 1;
        }

        if (a % 4 == 2) 
        {
            return a+1;
        }

        if (a % 4 == 3) 
        {
            return 0;
        }
        return 0;
    }
}
