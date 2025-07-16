package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][];

        arr[0] = new int[3];
        arr[1] = new int[5];
        arr[2] = new int[2];

        /* int arr2d[][] = {
                    {2,3,4},
                    {6,7,8,9,10},
                    {5,7}
                };

        for(int i=0;i<arr2d.length;i++)
        {
            for(int j=0;j<arr2d[i].length;j++)
            {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        } */

        System.out.print("Enter the elements : ");
        
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[j] = sc.nextInt();
            }
        }

        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[j]);
            }
            System.out.println();
        }

        for (int[] arr1 : arr) {
            System.out.println(Arrays.toString(arr1));
        }

        for(int[]  a : arr)
        {
            System.out.println(Arrays.toString(a));
        }
    }
}
