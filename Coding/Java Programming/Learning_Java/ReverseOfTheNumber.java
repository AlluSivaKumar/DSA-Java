

public class ReverseOfTheNumber {
    public static void main(String[] args) {
        
        int num = -236787;
        int rev = 0;

        while(num>0)
        {
            rev = rev*10 + num % 10;//0+
            num = num/10;
        }



        System.out.print(rev);
    }
}
