package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTwoDimensional 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();//Declaration of ArrayList

        for(int i=0;i<3;i++)
        {
            list.add(new ArrayList<>());
        }

        for(int k=0;k<3;k++)
        {
            for(int j=0;j<3;j++)
            {
                list.get(k).add(sc.nextInt());
            }
        }

        System.out.println(list);

    }
}
