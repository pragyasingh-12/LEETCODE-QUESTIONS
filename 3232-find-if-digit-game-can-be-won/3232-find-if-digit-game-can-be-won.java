class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++)
        {
            int curr=nums[i];
            if(curr/10==0)
            {
                sum=sum+curr;
            }
            else
            {
                sum2=sum2+curr;
            }
        }
        if(sum!=sum2)
        {
            return true;
        }
        return false;
    }
}