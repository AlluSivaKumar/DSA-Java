enum lights
{
    red,yellow,green;
}

public class EnumIfElse {
    public static void main(String[] args) 
    {
        lights signal = lights.red;

        if(signal == lights.red)
        {
           System.out.println("Stop...."); 
        }
        else if(signal == lights.yellow)
        {
           System.out.println("wait...."); 
        }
        else
        {
           System.out.println("start...."); 
        }
    }
}
