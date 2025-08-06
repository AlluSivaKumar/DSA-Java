class Searching 
{
    public int search(int arr[],int target)
    {
        int start = 0;
        int end = arr.length;
        int mid ;
        while(start < end)
        {
            mid = (start+end)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if (mid > target)
            {
                 start = start+mid;
            }
            else
            {
                end = end - mid;
            }
        }
        return -1;
    }
}

public class BinarySearch 
{
    public static void main(String[] args) {
        int nums[] = {1,3,4,6,8,9,11,13,14};


        Searching obj = new Searching();
        int res = obj.search(nums, 1);

        if(res == -1)
        {
            System.out.println("The element is not present in the Array.");
        }
        else
        {
            System.out.println("The element present at index : "+res);
        }

    }
}
