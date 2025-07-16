package Arrays;

public class Max {
    public static void main(String[] args) 
    {

        int arr[] = {1,2,3,5,6,23,8,53,78,31};
        int greatest = max(arr);
        System.out.println(greatest);

    }
    
    static int max(int[] arr)
    {
        int big = arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>big)
            {
                big = arr[i];
            }
        }

        return big;
    }
}
