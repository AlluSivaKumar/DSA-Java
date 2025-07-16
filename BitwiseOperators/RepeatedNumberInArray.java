package BitwiseOperators;

public class RepeatedNumberInArray {
    public static void main(String[] args) 
    {
        int arr[] = {2,4,2,5,4,21,78,78,5};
        int ans = repeatedNumber(arr);
        System.out.println(ans);
    }

    static int repeatedNumber(int[] arr)
    {
        int res = 0;
        
        for(int i=0;i<arr.length;i++)
        {
            res = res^arr[i];
        }
        return res;
    }
}
