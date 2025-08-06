class Add
{
    public void shows()
    {
        System.out.println("In A Show....");
    }
    public void man()
    {
        System.out.println("Here is a Man...");
    }
}
class Bdd extends Add
{
    @Override
    public void shows()
    {
        System.out.println("In B Show....");
    }
    /* public void man()
    {
        System.out.println("Here is not a Man...");
    } */
}


public class Annotations {
    public static void main(String[] args) {
        Bdd obj = new Bdd();
        obj.shows();
        obj.man();
    }
}
