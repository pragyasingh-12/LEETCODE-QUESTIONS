class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int l1=ax2-ax1;
        int b1=ay2-ay1;
        int l2=bx2-bx1;
        int b2=by2-by1;
        int area1=l1*b1;
        int area2=l2*b2;
        int sum=area1+area2;
        int l3=Math.max(0, Math.min(ax2, bx2)-Math.max(ax1, bx1));
        int b3=Math.max(0, Math.min(ay2, by2)-Math.max(ay1, by1));
        int overlap=l3*b3;
        return sum-overlap;
    }
}
