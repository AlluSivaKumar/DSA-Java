package BinarySearchIn2dArrays;

import java.util.Arrays;
import java.util.Scanner;

public class NormalSearching 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int arr[][] = {{1,2,3},
                        {4,5,6},
                        {7,8,9}
                      };
        int target = sc.nextInt();
        System.out.println(Arrays.toString(values(arr, target)));
    }
    public static int[] values(int arr[][],int target)
    {
        int array[] = new int[2];
        array[0] = -1;
        array[1] = -1;
        for(int i = 0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j] == target)
                {
                    array[0] = i;
                    array[1] = j;
                    return array;
                }
            }
        }
        return array;
    }
}

