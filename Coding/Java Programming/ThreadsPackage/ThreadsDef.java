package ThreadsPackage;

class computer extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("Run");
            try 
            {
                Thread.sleep(2);
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
        
    }
}
class Laptop extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("Coding....");
            try 
            {
                Thread.sleep(2);
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }

        }
        
    }
}

public class ThreadsDef 
{
    public static void main(String[] args) 
    {
        computer obj1 = new computer();
        Laptop obj2 = new Laptop();

        obj2.setPriority(Thread.MAX_PRIORITY);//using prirority what should be done
        //you can't run normal objects in multiple threads
        obj1.start();
        obj2.start();   
    }
    
}