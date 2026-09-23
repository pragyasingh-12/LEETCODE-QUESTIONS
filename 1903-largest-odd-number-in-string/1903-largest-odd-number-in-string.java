class Solution {
    public String largestOddNumber(String num) {
        int[] nums = num.chars()
                            .map(Character::getNumericValue)
                            .toArray();
        int res=0;
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]%2!=0)
            {
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}