class A
{
    int age = 10;
    public void show()
    {
        System.out.println("In Show");
    }
    static class B
    {
        public void config()
        {
            System.out.println("In Config");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        //A.B obj1 = obj.new B();
        A.B obj1 = new A.B();
        obj1.config();
    }
}
