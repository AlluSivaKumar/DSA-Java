package BitwiseOperators;

public class EvenNumber {
    public static void main(String[] args) 
    {
        int n = 48;
        System.out.println((iseven(n)));
    }
    static boolean iseven(int n)
    {
        return (n & 1) == 0;
    }
}
