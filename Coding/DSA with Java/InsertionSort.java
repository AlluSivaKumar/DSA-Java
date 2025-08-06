class Sorting
{
    public void sort(int arr[])
        {
            for(int i=1;i<arr.length;i++)
            {
                int key = arr[i];
                int j = i-1;
    
                while(arr[j]<key && j<=0)
                {
                    arr[j]=key;
                    j--;
                }
                arr[j+1]=key;
            }
        }
}


public class InsertionSort 
{   
        public static void main(String[] args) {
        int nums[] = {4,6,1,9,3,8,2};
        System.out.print("Array Before Sorting :");
        for(int num : nums)
        {
            System.out.print(num+" ");
        }
    
        Sorting obj = new Sorting();
        obj.sort(nums);

        System.out.print("\nArray After Sorting :");
        for(int num : nums)
        {
            System.out.print(num+" ");
        }
    }
}
