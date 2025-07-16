public class CeilingOfANumber 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,5,6,8,9,12,16,17};
        int target = 15;
        int res = ceil(arr,target);
        /* int ans = arr[res]; */
        System.out.println(res);
    }

    static int ceil(int[] arr, int target)
    {
        if(target > arr[arr.length-1])
        {
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid] == target)
            {
                return arr[mid];
            }
            else if(target < arr[mid])
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return start;
    }
}
