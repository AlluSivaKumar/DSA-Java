package Recursion;

public class FibonacciNumber 
{
    static int fibo(int n)
    {
        
        //base condition
        if(n<=1)
        {
            return n;
        }
            return fibo(n-1)+fibo(n-2);
        
    }
    public static void main(String[] args) 
    {
        int res = fibo(4);
        System.out.println(res);
    }
}
