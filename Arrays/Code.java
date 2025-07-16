package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Code 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[3];
        arr[0] = 23;
        arr[1] = 33;
        arr[2] = 43;
        //[23, 33, 43]
        System.out.println(arr[2]);

        int nums[] = new int[5];
        //input using for loop
        for(int i=0; i<nums.length; i++)
        {
            nums[i] = sc.nextInt();
        }

        //for loop to print numbers in the array
        for(int i=0; i<nums.length; i++)
        {
            System.out.println(nums[i]);
        }

        //Enhnanced for loop to print numbers in the array
        for(int num : nums)
        {
            System.out.println(num);
        }

        //using toString Method
        System.out.println(Arrays.toString(nums));
    }
}
