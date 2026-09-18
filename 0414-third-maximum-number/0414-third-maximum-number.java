class Solution {
    public int thirdMax(int[] nums) {
        long largest = Long.MIN_VALUE;
        long seclargest = Long.MIN_VALUE;
        long thirdlargest = Long.MIN_VALUE;
        
        for(int i = 0; i < nums.length; i++)
        {
            if (nums[i] == largest || nums[i] == seclargest || nums[i] == thirdlargest) 
            {
                continue;
            }
            
            if(nums[i] > largest)
            {
                thirdlargest = seclargest;
                seclargest = largest;
                largest = nums[i];
            }
            else if(nums[i] > seclargest)
            {
                thirdlargest = seclargest;
                seclargest = nums[i];
            }
            else if(nums[i] > thirdlargest)
            {
                thirdlargest = nums[i];
            }
        }
        if(thirdlargest == Long.MIN_VALUE)
        {
            return (int) largest;
        }
        
        return (int) thirdlargest;
    }
}
