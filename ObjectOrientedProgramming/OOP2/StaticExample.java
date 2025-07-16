package ObjectOrientedProgramming.OOP2;

public static class StaticExample 
{
    public class  StaticBlock
    {
        static  int a = 10;
        static int b;

        static 
        {
            System.out.println("I,m in static block");
            b = a*5;
            System.out.println(b);
        }
    }
    public static void main(String[] args) 
    {
        StaticBlock obj = new StaticBlock();

    }
}
