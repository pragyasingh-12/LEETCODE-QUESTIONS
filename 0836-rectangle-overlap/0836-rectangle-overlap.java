class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int res1=rec1[2]-rec2[0];
        int res2=rec1[3]-rec2[1];
        if(res1>0 && res2>0)
        {
            return true;
        }
        return false;
    }
}