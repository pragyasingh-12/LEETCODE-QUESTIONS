class Solution {
    public int findPeakElement(int[] nums) {
        int ans[]=Arrays.copyOf(nums,nums.length);
        Arrays.sort(ans);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==ans[ans.length-1])
            {
                return i;
            }
        }
        return 0;
    }
}