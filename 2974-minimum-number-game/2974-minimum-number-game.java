class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int j=0;
        int k=1;
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(i%2!=0)
            {
                ans[j]=nums[i];
                j+=2;
            }
            else
            {
                ans[k]=nums[i];
                k+=2;
            }
        }
        return ans;
    }
}