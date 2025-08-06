package ObjectOrientedProgramming.OOP2;

public class StaticExample 
{
    public static class  StaticBlock
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
        @SuppressWarnings("unused")
        StaticBlock obj = new StaticBlock();
        //automatically prints what present in the static block when the object is created.

    }
}
