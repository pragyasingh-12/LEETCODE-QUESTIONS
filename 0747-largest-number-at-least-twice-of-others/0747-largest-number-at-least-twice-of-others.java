class Solution {
    public int dominantIndex(int[] nums) {
        int[] copy=nums.clone();
        Arrays.sort(copy);
            if(copy[copy.length-1]>=copy[copy.length-2]*2)
            {
                for(int i=0;i<nums.length;i++)
                {
                    if(nums[i]==copy[copy.length-1])
                    {
                        return i;
                    }
                }
            }
        return -1;
    }
}