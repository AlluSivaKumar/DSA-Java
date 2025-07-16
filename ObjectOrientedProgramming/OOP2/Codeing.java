package ObjectOrientedProgramming.OOP2;
import static ObjectOrientedProgramming.OOPTwo.Code.msg;


public class Codeing 
{
    @SuppressWarnings("static-access")
    public static void main(String[] args) 
    {
        message();
        msg();
        Human siva = new Human(45,"si va", 100000);
        System.out.println(siva.age);
        System.out.println(siva.salary);
        

        Human karthik = new Human(23,"Kart",199880);
        System.out.println(karthik.name);
        System.out.println(siva.population);
        System.out.println(karthik.population);     
        
    }

    public static void message()
    {
        System.out.println("I'm siva.");
    }
}
