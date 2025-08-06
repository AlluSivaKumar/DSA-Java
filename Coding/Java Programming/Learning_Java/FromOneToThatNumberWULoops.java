import java.util.Scanner;

public class FromOneToThatNumberWULoops {
    public static void printt(int n)
        {
            if(n==0)
            {
                return;
            }
            printt(n-1);
            System.out.print(n+" ");
        }
        public static void main(String[] args) {
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            @SuppressWarnings("unused")
            int num = sc.nextInt();
    
            printt(num);

    }
}
