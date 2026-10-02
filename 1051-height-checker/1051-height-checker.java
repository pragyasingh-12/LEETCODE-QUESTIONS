class Solution {
    public int heightChecker(int[] heights) {
        int expected[]=new  int[heights.length];
        for( int i=0;i<heights.length;i++)
        {
            expected[i]=heights[i];
        }
        for(int i=0;i<heights.length;i++)
        {
            for(int j=0;j<heights.length-1-i;j++)
            {
                if(heights[j]>heights[j+1])
                {
                    int temp=heights[j];
                    heights[j]=heights[j+1];
                    heights[j+1]=temp;
                }
            }
        }
        int count=0;
        for(int i=0;i<heights.length;i++)
        {
            if(heights[i] != expected[i])
            {
                count++;
            }
        }
        return count;
    }
}