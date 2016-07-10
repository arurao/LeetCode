public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        
        
        int i=0;
        int j=nums.length-1;
        
       while(i<j)
            {   
                if(nums[i]+nums[j] < target)
                {
                    j--;
                }
                else if (nums[i]+nums[j]>target)
                {
                    i++;
                }
                else
                {
                    int ans[]={i, j};
                return ans;
                }
            }
        
        return null;
    }
}