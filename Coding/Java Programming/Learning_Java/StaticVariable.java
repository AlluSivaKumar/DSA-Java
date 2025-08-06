class Mobile
{
    String brand;
    int price;
    static String type;
    
    public void show()
    {
        System.out.println("My mobile is "+brand+".It costs "+price+" dollars.It is a "+type);
    }
    }
    
    public class StaticVariable {
        public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.brand = "apple";
        obj.price = 1500;
    
        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1000;
            
        
        Mobile.type = "Smart Phone";
        obj.show();
        obj2.show();
    }
}
