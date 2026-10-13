class Solution {
    public int differenceOfSums(int n, int m) {
        int sum=0;
        int sum2=0;
        for(int i=1;i<=n;i++)
        {
            if(i%m!=0)
            {
                sum=sum+i;
            }
            if(i%m==0)
            {
                sum2=sum2+i;
            }
        }
        int num1=sum;
        int num2=sum2;
        return num1-num2;
    }
}