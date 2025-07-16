package BinarySearch;

public class PeakInAMountainArray 
{
    public static void main(String[] args) 
    {
        int[] arr = {0,2,3,5,2,1,0};
        System.out.println(binary(arr));
        
    }   

    static int binary(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;

        while (start < end)
        {
            int mid = start + (end-start)/2;

            if(arr[mid] > arr[mid+1])
            {
                //you are decresaing part of the array;
                end = mid;
                
            }
            else 
            {
                start = mid + 1;//we know that mid+1 element > mid element
            }
        }

        return start;
    }
}
