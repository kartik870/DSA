public class ArraySorted 
{
    public boolean isSorted(int[] nums,int n)
    {
        if(n == 1|| n==0)
        {
            return true;
        }
        return nums[n-1]>=nums[n-2] && isSorted(nums, n-1);
    }
}
