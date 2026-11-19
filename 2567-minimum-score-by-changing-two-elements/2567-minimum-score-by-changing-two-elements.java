class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int firdiff=nums[nums.length-1]-nums[2];
        int secdiff=nums[nums.length-2]-nums[1];
        int thidiff=nums[nums.length-3]-nums[0];
        int res=Math.min(firdiff, secdiff);
        int res2=Math.min(res,thidiff);
        return res2;
    }
}