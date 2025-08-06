enum Computer
{
    Coding,Playing,Chatting,Drawing;

    private String name = "Siva";

    public String getName()
        {
            return name;
        }
    }
    
    
    public class EnumClass 
    {
        public static void main(String[] args) 
        {
            Computer[] work = Computer.values();
    
            for(Computer working : work)
            {
                System.out.println(working);
            }
        
            String lap = Computer.Playing.getName();
            System.out.println(lap);
    }
}
