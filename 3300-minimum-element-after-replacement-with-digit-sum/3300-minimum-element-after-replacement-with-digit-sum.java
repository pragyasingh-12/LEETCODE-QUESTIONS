class Solution {
    public int minElement(int[] nums) {
        int max=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            int cur=nums[i];
            int res=0;
            while(cur>0)
            {
                int ld=cur%10;
                sum=sum+ld;
                cur=cur/10;
                res=sum;
            }
            if(res<max)
            {
                max=res;
            }
        }
        return max;
    }
}