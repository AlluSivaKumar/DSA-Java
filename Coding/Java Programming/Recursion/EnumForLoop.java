enum lights
{
    red,yellow,green;
}

public class EnumForLoop
{
    public static void main(String[] args) 
    {
        lights signal[] = lights.values();

        for(lights light : signal)
        {
            System.out.println(light);
        }
        
    }
}
