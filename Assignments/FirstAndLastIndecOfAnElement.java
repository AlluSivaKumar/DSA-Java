import java.util.Arrays;

public class FirstAndLastIndecOfAnElement {
    public static void main(String[] args) {
        int arr[] = {1};
        int target = 1;
        int[] res = Finding(arr,target);
        System.out.println(Arrays.toString(res));

    }

    static int[]  Finding(int[] arr,int target)
    {
        /* int[] ans = {-1,-1};

        for(int i=0;i<=arr.length-1;i++)
        {
            if(target == arr[i])
            {
                ans[0] = i;
                break;
            }
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i] == target)
            {
                ans[1] = i;
                break;
            }
        }

        return ans; */

        int[] ans = {-1,-1};
        /* int target = target; */
        int start = find(arr,target , true);
        int end = find(arr,target,false);

        ans[0] = start;
        ans[1] = end;


        return ans;
        
    }

    static int find(int[] nums,int target,boolean FindingIndex)
    {
        int ans = -1;

        int start = 0;
        int end = nums.length-1;

        while (start <= end) 
        {
            int mid = (start+end)/2;
            if(target > nums[mid])
            {
                start = mid + 1;
            }
            else if(target < nums[mid])
            {
                end = mid - 1;
            }
            else
            {
                ans = mid;
                if(FindingIndex)
                {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}
