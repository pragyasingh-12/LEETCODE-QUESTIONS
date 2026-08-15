class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxarea=0;
        double maxDiagonal=0;
        for(int i=0;i<dimensions.length;i++)
        {
            int len=dimensions[i][0];
            int wid=dimensions[i][1];
            double diagonal=Math.sqrt((len*len) + (wid*wid));
            int area=len*wid;
           if(diagonal>maxDiagonal)
           {
            maxDiagonal=diagonal;
            maxarea=area;
           }
           else if(diagonal==maxDiagonal)
           {
            maxarea=Math.max(maxarea,area);
           }
        }
        return maxarea;
    }
}