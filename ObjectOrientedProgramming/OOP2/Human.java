package ObjectOrientedProgramming.OOP2;

public class Human 
{
        int age;
        String name;
        int salary;
        static long population;
        
        public Human(int age,String name,int salary)
        {
            this.age = age;
            this.name = name;
            this.salary = salary;

            //you just access the static variable uses the class name.
            Human.population = population + 1;
        }

    public Human() {
    }
}
