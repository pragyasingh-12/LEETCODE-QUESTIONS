class Solution {
    public int fact(int num)
    {
        if(num==0 || num==1)
        {
            return 1;
        }
        int fac=1;
        for(int i=1;i<=num;i++)
        {
            fac=fac*i;
        }
        return fac;
    }
    
    public int climbStairs(int n) {
        // Base cases: 1 way for 1 step, 2 ways for 2 steps
        if (n <= 2) {
            return n;
        }
        
        int first = 1;  // Ways to reach step 1
        int second = 2; // Ways to reach step 2
        int ans = 0;
        
        // Loop from step 3 up to n, adding the previous two steps together
        for (int i = 3; i <= n; i++) {
            ans = first + second;
            first = second; // Shift forward for the next step
            second = ans;
        }
        
        return ans;
    }
}
