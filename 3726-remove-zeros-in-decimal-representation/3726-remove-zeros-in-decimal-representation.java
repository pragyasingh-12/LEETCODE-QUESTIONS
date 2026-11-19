class Solution {
    public long removeZeros(long n) {
        if(n>=0 && n<10)
        {
            return n;
        }
        String str=Long.toString(n);
        String res=str;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='0')
            {
                res=str.replace("0","");
            }
        }
        long num=Long.parseLong(res);
        return num;
    }
}