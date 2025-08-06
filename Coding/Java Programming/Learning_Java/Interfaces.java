interface Aa
{
    void show();
    void config(); 
}
class B implements Aa
{
    public void show()
    {
        System.out.println("In show");
    }
    public void config()
    {
        System.out.println("In Config");
    }
}

public class Interfaces 
{
    public static void main(String[] args) 
    {
        Aa obj = new B();
        obj.show();
        obj.config();
    }
}
