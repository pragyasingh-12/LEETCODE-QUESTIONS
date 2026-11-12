class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        int count=1;
        int longest=1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                continue;
            }
            if(nums[i]+1==nums[i+1])
            {
                count++;
                longest=Math.max(count,longest);
            }
            else
            {
                count=1;
            }
        }
        return longest;
    }
}