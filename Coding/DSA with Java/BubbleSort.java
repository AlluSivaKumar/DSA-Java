class Sorting 
{
    public void sort(int arr[]) 
    {
        int size = arr.length;
        int temp = 0;

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

public class BubbleSort 
{
    public static void main(String[] args) 
    {
        int nums[] = {2,4,1,9,5,6};

        System.out.print("Elements Before Sorting the array: ");
        for(int num : nums)
        {
            System.out.print(num+" ");
        }

        Sorting obj = new Sorting();
        obj.sort(nums);

        System.out.print("\nElements After Sorting the Array: ");
        {
            for(int num : nums)
            {
                System.out.print(num+" ");
            }
        }
    }
}
