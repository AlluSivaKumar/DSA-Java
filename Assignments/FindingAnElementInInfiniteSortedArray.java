public class FindingAnElementInInfiniteSortedArray 
{
    public static void main(String[] args)
    {
        int[] arr = {3, 5, 7, 9, 10, 90,100, 130, 140, 160, 170};
        int target = 100;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr,int target)
    {
        //First Find the range
        //starting box size 2
        int start = 0;
        int end = 1;

        //condition for target lie in range
        while(end < arr.length && target > arr[end])
        {
            int newStart = end + 1;
            end = end + (end - start + 1)*2;
            start = newStart;
        }

        return BinarySearch(arr, target, start, end);
    }

    static int BinarySearch(int[] arr, int target, int start, int end)
    {
        while(start <= end)
        {
            //finding Middle element
            int mid = start + (end - start) / 2;

            if(target < arr[mid])
            {
                end = mid - 1;
            }
            else if (target > arr[mid]) 
            {
                start = mid + 1;
            }
            else
            {
                //ans found
                return mid;
            }
        }

        return -1;
    }
}
