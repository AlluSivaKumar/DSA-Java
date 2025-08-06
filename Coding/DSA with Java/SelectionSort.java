class Sorting {
    public void sort(int arr[])
    {
        int size = arr.length;
        int temp = 0;
        int min_index = 0;

        for(int i=0;i<size-1;i++)
        {
            min_index = i;
            for(int j=i+1;j<size-1;j++)
            {
                if(arr[min_index]>arr[j])
                {
                    min_index = j;
                }
            }

            temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }

    }    
}

public class SelectionSort 
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
