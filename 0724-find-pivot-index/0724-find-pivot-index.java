class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int sum2=0;
        int start=0;
        int end=nums.length-1;
        while(end>=0) 
        {
            sum2=sum2+nums[end];
            end--;
        }
        while(start<nums.length) 
        {
            sum2=sum2-nums[start];
            if(sum == sum2) 
            {
                return start;
            }
            sum=sum+nums[start];
            start++;
        }

        return -1;
    }
}
