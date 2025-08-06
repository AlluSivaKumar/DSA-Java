package Arrays;

public class SmallestElementGreaterThanTarget 
{
    public static void main(String[] args) 
    {
        char[] arr = {'x','x','y','y'};
        System.out.println(SEGT(arr, 'a'));
    }   

    static char SEGT(char[] arr,char target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(target < arr[i])
            {
                return arr[i];
            }
        }
        return target;
    }
}