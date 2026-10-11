class Solution {
    public int mirrorDistance(int n) {
        int original=n;
        int rev=0;
        while(n>0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        int res=original-rev;
        int dis=Math.abs(res);
        return dis;
    }
}