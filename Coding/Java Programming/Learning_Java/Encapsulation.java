package Learning_Java;

class Human {
    private int age = 10 ;
    private String name = "Siva" ;

    public int getAge()
    {
        return age;
    }
    
    public String getName()
    {
        return name;
    }
    

    public void setAge(int a)
    {
        age = a;
    }
    
    public void setName(String n)
    {
        name = n;
    }
    
}


public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        System.out.println(obj.getName()+" : " +obj.getAge());
    }
}
