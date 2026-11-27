class Solution {
    public int rob(int[] nums) {
        int sum2=0;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            int newsum=sum+nums[i];
            int newsum2=Math.max(sum,sum2);
            sum=newsum2;
            sum2=newsum;
        }
        return Math.max(sum,sum2);
    }
}