class Solution {
    public boolean validDigit(int n, int x) {
        int rev=0;
        int num=n;
        int num2=n;
        while(num>0)
        {
            int ld=num%10;
            rev=rev*10+ld;
            num=num/10;
        }
        int fir=rev%10;
        if(fir==x)
        {
            return false;
        }
        while(num2>0)
        {
            int ld=num2%10;
            num2=num2/10;
            if(ld==x)
            {
                return true;
            }
        }
        return false;
    }
}