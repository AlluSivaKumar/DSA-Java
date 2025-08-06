interface Lap
{
    void coding();
}

interface Desk
{
    void drawing();
}

class Doing implements Lap,Desk
{
    public void coding() 
    {
        System.out.println("Coding.....");
    }

    public void drawing() 
    {
        System.out.println("Drawing.....");
    }
    
}


public class InterfaceExampleTwo 
{
    public static void main(String[] args) 
    {
        Doing obj = new Doing();
        obj.coding();
        obj.drawing();
    }
}
