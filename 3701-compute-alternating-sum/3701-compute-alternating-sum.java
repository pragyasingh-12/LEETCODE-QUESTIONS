class Solution {
    public int alternatingSum(int[] nums) {
        int sum=0;
        int sum2=0;
        if(nums.length==1)
        {
            return nums[0];
        }
        if(nums.length==2)
        {
            return nums[0]-nums[1];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                sum=sum+nums[i];
            }
            else
            {
                sum2=sum2+nums[i];
            }
        }
        int dif=sum-sum2;
        return dif;
    }
}