
public class VariableLengthArgs 
{
    public static void main(String[] args) 
    {
        func(6,7,8,2,4);
    }

    public static void func(int... v) {
        System.out.println("Number of arguments: " + v.length);
        for(int i : v)
        {
            System.out.println(i);
        }
    }
}