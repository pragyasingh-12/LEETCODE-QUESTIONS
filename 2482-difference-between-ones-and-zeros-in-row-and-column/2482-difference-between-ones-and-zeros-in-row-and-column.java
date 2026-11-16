class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int lastrow=grid.length-1;
        int[][] diff=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++) 
        {
            int onesrow=0,zerosrow=0;
            for(int col=0;col<grid[0].length; col++) 
            {
                if(grid[i][col]==1)
                {
                    onesrow++;
                }
                else zerosrow++;
            }

            for (int j=0;j<grid[0].length;j++) 
            {
                if(i==0) 
                {
                    int onescol=0, zeroscol=0;
                    for(int row = 0;row<grid.length;row++) 
                    {
                        if(grid[row][j]==1) 
                        {
                            onescol++;
                        }
                        else zeroscol++;
                    }
                    diff[lastrow][j]=onescol-zeroscol;
                }
                diff[i][j]=onesrow-zerosrow+diff[lastrow][j];
            }
        }
        return diff;
    }
}
