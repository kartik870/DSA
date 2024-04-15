public class ArraySorted 
{
    public boolean isSorted(int[] nums, int ind)
    {
        if(nums.length== 0 || nums.length == 1)
        {
            return true;
        }

        if(nums[ind]>nums[ind])
        {
            return false;
        }
        else
        {
            return isSorted(nums, ind+1)
        }
    }
}
