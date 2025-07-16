public class No_Of_Times_Array_Rotated 
{
    public static void main(String[] args) 
    {
        int arr[] = {-4,0,1,2,4,5,6,7};
        if(countRotations(arr) == -1)
        {
            System.out.println("Array is not rotated");
        }
        else
        {
            System.out.println(countRotations(arr)+1);
        }
    }

    static int countRotations(int[] arr)
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
}
