package Sorting;

import java.util.Arrays;

public class SelectionSort 
{
    public static void main(String[] args) 
    {
        int[] arr = {7,4,8,2};
        sorting(arr, arr.length, 0,0);
        System.out.println(Arrays.toString(arr));
    } 
    static void sorting(int[] arr, int i,int j,int max)
    {
        if(i==0)
        {
            return;
        }
        if(j < i)
        {
            
            if(arr[j] > arr[max])
            {
                sorting(arr, i, j+1 , j);
            }
            else
            {
                sorting(arr, i, j+1, max);
            }   
        }
        else
        {
            int temp = arr[max];
            arr[max] = arr[i-1];
            arr[i-1] = temp;
            sorting(arr, i-1, 0,0);
        }
    }
}
