class Solution {
    public String convertToBase7(int num) {
        if(num==0) 
        {
            return "0";
        }
        long base=0;
        int pow=0;
        boolean isNegative=num<0;
        long n=Math.abs((long)num);
        while(n>0)
        {
            long rem=n%7;
            base=base+(rem*(long)Math.pow(10, pow));
            pow++;
            n=n/7;
        }
        String ans=String.valueOf(base);
        return isNegative?"-"+ans:ans;
    }
}