class Solution {
    public boolean checkGoodInteger(int n) {
        int digitsum=0;
        int squaresum=0;
        while(n>0)
        {
            int rem=n%10;
            digitsum=digitsum+rem;
            int sq=rem*rem;
            squaresum=squaresum+sq;
            n=n/10;
        }
        if((squaresum-digitsum)<50)
        {
            return false;
        }
        return true;
    }
}