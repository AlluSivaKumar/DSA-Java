package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        ArrayList <Integer> list = new ArrayList<>();

        list.add(34);
        list.add(465);
        list.add(56);
        list.add(77);
        list.add(52);
        list.add(589);
        System.out.println(list);

        list.remove(4);
        System.out.println(list);
        System.out.println(list.contains(34));

        ArrayList <Integer> list2 = new ArrayList<>();
        for(int i=0;i<6;i++)
        {
            list2.add(sc.nextInt());
        }

        //get any item at index
        /* for(int i=0;i<6;i++)
        {
            list.get(i);
        } */
        System.out.println(list2);

    }
}
