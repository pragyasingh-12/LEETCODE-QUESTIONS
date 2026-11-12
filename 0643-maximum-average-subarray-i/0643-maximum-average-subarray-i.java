class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double curr_sum=0.0;
        double max_sum=-Double.MAX_VALUE;;
        for(int i=0;i<nums.length;i++)
        {
            curr_sum=curr_sum+nums[i];
            if(i>=k-1)
            {
                max_sum=Math.max(curr_sum, max_sum);
                curr_sum=curr_sum-nums[i-k+1];
            }
        }
       return max_sum/k;
    }
}