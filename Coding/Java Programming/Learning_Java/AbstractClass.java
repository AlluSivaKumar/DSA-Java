abstract class car
{
    public abstract void driving();

    public void playMusic()
    {
        System.out.println("Music Playing....");
    }
}
class BMW extends car
{
    public void driving()
    {
        System.out.println("Driving....");
    }
}

public class AbstractClass {
    public static void main(String[] args) 
    {
        car obj = new BMW();
        obj.driving();
        obj.playMusic();
        

    }
}
