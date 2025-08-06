@FunctionalInterface
interface cls 
{
    void shows();
}
class child implements cls
{
    @Override
    public void shows()
    {
        System.out.println("Hiii");
    }

}

public class FunctionalInterfaceeeee {
    public static void main(String[] args) {
        child obj = new child();
        obj.shows();
    }
}
