package Sorting;

import java.util.Arrays;

public class BubbleSort 
{
    public static void main(String[] args) 
    {
        int[] arr = {2,8,4,1};
        sorting(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void sorting(int[] arr,int i,int j)
    {
        if(i==0)
        {
            return;
        }

        if(j < i)
        {
            if(arr[j] > arr[j+1])//Ascending Order
            {
                //swap
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
            sorting(arr, i, j+1);
        }
        sorting(arr, i-1, j);
    }
}
