class Searching 
{
    public int search(int arr[],int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
}

public class LinearSearch 
{
    public static void main(String[] args) {
        int nums[] = {1,3,4,6,8,9,11,13,14};


        Searching obj = new Searching();
        int res = obj.search(nums, 6);

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
