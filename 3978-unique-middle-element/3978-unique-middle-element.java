class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int mid=(start+(end-start))/2;
        int curr=nums[mid];
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==curr)
            {
                count++;
            }
        }
        if(count>=2)
        {
            return false;
        }
        return true;
    }
}