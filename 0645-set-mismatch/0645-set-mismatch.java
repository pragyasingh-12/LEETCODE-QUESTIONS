class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans[]=new int[2];
        int fir=0;
        int n=nums.length;
        int sum=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            sum=sum+nums[i];
            if(nums[i]==nums[i+1])
            {
                fir=nums[i+1];
                sum=sum-nums[i];
            }
        }
        sum=sum+nums[n-1];
        int expectedsum=(n*(n+1))/2;
        int missing=expectedsum-sum;
        ans[0]=fir;
        ans[1]=missing;
        return ans;
    }
}