public class Search_in_a_rotated_array 
{
    public static void main(String[] args) 
    {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] nums, int target) 
    {
        int pivot = findPivot(nums);
        //if you not find any pivot it means the array is not rotated.
        if(pivot == -1)
        {
            return binarySearch(nums, target, 0, nums.length-1);
        }

        //if you found the pivot you have 2 ascending arrays..
        if(nums[pivot] == target)
        {
            return pivot;
        }

        if(target >= nums[0])
        {
            return binarySearch(nums, target, 0, pivot-1);
        }

        return binarySearch(nums, target, pivot+1, nums.length-1);

    }

    static int findPivot(int[] arr)
    {
        //Finding the largest element in the  array
        int start = 0;
        int end = arr.length-1;

        while (start <= end) 
        {
            //let say arr = {4,5,6,0,1,2,3}
            int mid = start + (end - start)/2;

            /* CASE 1 */
            //What if mid is end , index is out of bound so we use mid < end
            if(mid < end && arr[mid] > arr[mid+1])
            {
                return mid;
            }
            /* CASE 2 */
            //What if mid is start , index is out of bound so we use mid > start

            if(mid > start && arr[mid] < arr[mid-1])
            {
                return mid-1;
            }
             /* CASE 3 */
            if(arr[start] > arr[mid])
            {
                end = mid-1;
            }
            /* CASE 4 */
            else 
            {
                start = mid + 1;
            }
        }
        
        return -1;
    }

    static int binarySearch(int[] arr,int target , int start,int end)
    {
        while(start <= end)
        {
            int mid = start + (end-start)/2;

            if(target > arr[mid])
            {
                start = mid + 1;
            }
            else if(target < arr[mid])
            {
                end = mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicates(int[] arr)
    {
        //Finding the largest element in the  array
        int start = 0;
        int end = arr.length-1;

        while (start <= end) 
        {
            //let say arr = {4,5,6,0,1,2,3}
            int mid = start + (end - start)/2;

            /* CASE 1 */
            //What if mid is end , index is out of bound so we use mid < end
            if(mid < end && arr[mid] > arr[mid+1])
            {
                return mid;
            }
            /* CASE 2 */
            //What if mid is start , index is out of bound so we use mid > start

            if(mid > start && arr[mid] < arr[mid-1])
            {
                return mid-1;
            }
        
            //if the elements at start and middle skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end])
            {
                start ++;
                end--;
            }
        }
        
        return -1;
    }
}
