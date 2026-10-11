class Solution {
    public int sumOfSquares(int[] nums) {
        int sum=0;
        int sq=0;
        int n=nums.length;
        for(int i=1;i<=nums.length;i++)
        {
            if(n%i==0)
            {
                sq=nums[i-1]*nums[i-1];
                sum=sum+sq;
            }
        }
        return sum;
    }
}