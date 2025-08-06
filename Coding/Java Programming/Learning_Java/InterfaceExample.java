/* class Computer
{
    public void code()
    {

    }
}    
class Laptop extends Computer
{
    public void code()
    {
        System.out.println("Run and Compile...");
    }
}
    
class Desktop extends Computer
{
    public void code()
    {
        System.out.println("Run and Compile... Faster..");
    }
}
    
class Developer 
{
    public void devApp(Computer object)
    {
        object.code();
    }
}
 */

interface Computer
{
    void code();
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("Run and Compile...");
    }
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("Run and Compile... Faster..");
    }
}

class Developer
{
    public void devApp(Computer object)
    {
        object.code();
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer Desk = new Desktop();

        Developer obj = new Developer();
        obj.devApp(lap);
        obj.devApp(Desk);
        
        //Desk.code();
    }
}
