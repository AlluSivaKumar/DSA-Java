package BinarySearch;

public class Code {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,7,9,11,78};
        int target = 78;
        int res = search(arr,target);
        System.out.println(res);
    }

    static int search(int arr[],int target)
    {
        int start = 0;
        int end = arr.length-1;        

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
}
