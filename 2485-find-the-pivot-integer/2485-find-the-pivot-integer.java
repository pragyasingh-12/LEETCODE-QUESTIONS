class Solution {
    public int pivotInteger(int n) {
        if(n==1)
        {
            return 1;
        }
        int left=1;
        int right=n;
        int leftsum=1;
        int rightsum=n;
        while(left<right)
        {
            if(leftsum<rightsum)
            {
                left=left+1;
                leftsum=leftsum+left;
            }
            else
            {
                right=right-1;
                rightsum=rightsum+right;
            }
        }
        if(leftsum==rightsum)
        {
            return left;
        }
        return -1;
    }
}