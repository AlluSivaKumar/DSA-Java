package BitwiseOperators;

public class Find_IthDigit {
    public static void main(String[] args) 
    {
        System.out.println(ithDigit(35,1));
    }

    static byte ithDigit(int num,int place)
    {
        return (byte) (num & (1<<(place-1)));
    }
    
}