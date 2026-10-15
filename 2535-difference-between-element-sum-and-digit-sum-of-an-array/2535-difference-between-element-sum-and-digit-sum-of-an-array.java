class Solution {
    public int differenceOfSum(int[] nums) {
        int e_sum=0;
        int num=0;
        int d_sum=0;
        for(int i=0;i<nums.length;i++)
        {
            e_sum=e_sum+nums[i];
            num=nums[i];
            while(num>0)
            {
                int ld=num%10;
                d_sum=d_sum+ld;
                num=num/10;
            }
        }
        int ans=Math.abs(e_sum-d_sum);
        return ans;
    }
}