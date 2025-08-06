enum lights
{
    red,yellow,green;
}

public class EnumSwitch 
{
    public static void main(String[] args) 
    {
        lights signal = lights.red;
        switch (signal) 
        {
            case lights.red:
                System.out.println("Stop....");
                break;
            case lights.yellow:
                System.out.println("Wait....");
                break;
            default:
                System.out.println("Start....");
                break;
        }
    }
}
