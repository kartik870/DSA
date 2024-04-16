public class LinearSearch {
    
    public boolean search(int[] nums,int target)
    {
        return search(nums, target, 0);
    }

    public boolean search(int[] nums, int target,int index)
    {
        if(nums.length==index)
        {
            return false;
        }
        if(nums.length==0)
        {
            return false;
        }

        return nums[index]==target || search(nums, target, index+1);
    }
}
