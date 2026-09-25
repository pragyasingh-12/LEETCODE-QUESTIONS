class Solution {
    public int binaryOnes(int num) 
    {
        int count=0;
        while(num>0)
        {
            int rem=num % 2;
            if(rem==1) 
            {
                count++;
            }
            num=num/2;
        }
        return count;
    }

    public int[] countBits(int n) 
    {
        int[] ans = new int[n + 1];
        for (int i=0;i<=n;i++) 
        {
            ans[i]=binaryOnes(i);
        }
        return ans;
    }
}