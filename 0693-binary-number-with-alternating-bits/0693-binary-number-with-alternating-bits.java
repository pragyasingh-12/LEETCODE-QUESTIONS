class Solution {
    public boolean hasAlternatingBits(int n) {
       while(n>1)
       {
        int last=n&1;
        int seclast=(n>>1)&1;
        if(last==seclast)
        {
            return false;
        }
        n=n>>1;
       }
       return true;
    }
}
