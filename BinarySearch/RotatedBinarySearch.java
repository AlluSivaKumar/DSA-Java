package BinarySearch;
import javax.lang.model.util.ElementScanner14;
@SuppressWarnings("unused")
public class RotatedBinarySearch 
{
    public static void main(String[] args) 
    {
        int[] arr = {4,5,6,7,0,1,2};
        //System.out.println(findPivot(arr));
        System.out.println(search(arr, 0));
    }
    static int search(int[] nums,int target)
    {
        int pivot = findPivot(nums);
        //If you did not fount Pivot , it means the array is not rotated       
        if(pivot == -1)
        {
            //Just do BinarySearch
            return binarySearch(nums, target,0,nums.length-1);
        }
        //if pivot is found , you found 2 asc sorted arrays
        /* 3 CASES */
        /* CASE 1 */
        if(nums[pivot] == target)
        {
            return pivot;
        }
        /* CASE 2 */
        if (target > nums[0])
        {
            return binarySearch(nums, target , pivot + 1 , nums.length - 1);  
        }
        /* CASE 3 */
        //target < start
        return binarySearch(nums, target, 0, pivot + 1);
    }
    static int binarySearch(int arr[],int target ,int start , int end)
    {
        //start = 0;
        //end = arr.length-1;  

        while(start <= end)
        {
            int mid = start + (end - start)/2;

            if(arr[mid] == target)
            {
                return mid;
            }
            else  if (arr[mid]<target) 
            {
                start = mid + 1;
            } 
            else 
            {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr)
    {

        int start = 0;
        int end  = arr.length-1;

        while (start <= end) 
        {
            int mid = start + (end - start)/2;

            /* CASE 1 */
            if(mid < end && arr[mid] > arr[mid + 1])
            {
                return mid;
            }

            /* CASE 2 */ 
            if(mid > start && arr[mid] < arr[mid - 1]) 
            {
                return mid - 1;
            }

            /* CASE 3 */
            if(arr[start] > arr[mid])
            {
                end = mid - 1;
            }

            /* CASE 4 */
            else //(start < mid) 
            {
                start = mid + 1;
            }
        }

        return -1;
    }
}
