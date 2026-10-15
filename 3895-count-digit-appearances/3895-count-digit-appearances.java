class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int num=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            num=nums[i];
            while(num>0)
            {
                int ld=num%10;
                if(ld==digit)
                {
                    count++;
                }
                num=num/10;
            }
        }
        return count;
    }
}