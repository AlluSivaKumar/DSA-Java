public class SelSort {
    public static void main(String[] args) {
        int nums[] = {2,4,1,9,5,6};

        System.out.print("Elements Before Sorting the array: ");
        for(int num : nums)
        {
            System.out.print(num+" ");
        }
        System.out.println();

        int MaxIndex = -1;

        for(int i=0;i<nums.length;i++)//2 4 1 9 5 6
        {
            for(int j=i+1;j<nums.length-1;j++)//4 1 9 5 6
            {
                if(nums[i] > nums[j+1])
                {
                    MaxIndex = i;
                }
            }
            int temp = nums[MaxIndex];
            nums[MaxIndex] = nums[i];
            nums[i] = temp;

            for(int num:nums)
            {
                System.out.print(num +" ");
            
            }
            System.out.println();
        }

    

        System.out.print("\nElements After Sorting the array: ");
        for(int num : nums)
        {
            System.out.print(num+" ");
        }

    }
}
