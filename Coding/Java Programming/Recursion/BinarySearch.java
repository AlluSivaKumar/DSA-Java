package Recursion;

public class BinarySearch 
{
    static int binary(int[] arr,int target,int start,int end)
    {
       
        if(start>end){
            return -1;
        } 
        int mid = start+(end-start/2);

      

        if(arr[mid]==target)
        {
            return mid;
        }
        if(target<arr[mid])
        {
        return binary(arr, target,start,mid-1);
        }
        return binary(arr,target,mid+1,end);

    }


    public static void main(String[] args) 
    {
        int nums[] ={2,4,5,7,8,9,10,11};
        System.out.println(binary(nums, 51,0,nums.length-1));
    }
}

