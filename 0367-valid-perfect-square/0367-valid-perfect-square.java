class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<1)
        {
            return false;
        }
        if(num==1)
        {
            return true;
        }
        long start=1;
        long end=num/2;
        long ans=0;
        while(start<=end)
        {
            long mid=start+(end-start)/2;
            ans=mid*mid;
            if(ans==num)
            {
               return true;
            }
            else if(ans<num)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return false;
    }
}