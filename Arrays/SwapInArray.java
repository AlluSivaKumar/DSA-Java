package Arrays;

import java.util.Arrays;

public class SwapInArray {
    public static void main(String[] args) 
    {

        int arr[] = {1, 34, 34, 67, 436, 78};
        swap(arr,0,5);
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
