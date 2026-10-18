class Solution {
    public int sumBase(int n, int k) {
        if(n==k)
        {
            return 1;
        }
        int sum=0;
        while(n>0)
        {
            int ld=n%k;
            int div=n/k;
            sum=sum+ld;
            n=div;
        }
        return sum;
    }
}