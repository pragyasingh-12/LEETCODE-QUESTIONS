class Solution {
    public int findClosestNumber(int[] nums) {
        int n=nums.length;
        int dis=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            int pos=Math.abs(nums[i]);
            if((pos-0)<dis || (pos==dis && nums[i]>ans))
            {
                dis=pos;
                ans=nums[i];
            }
        }
        return ans;
    }
}
