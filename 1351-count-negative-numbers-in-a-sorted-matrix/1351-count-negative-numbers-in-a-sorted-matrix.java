class Solution {
    public int countNegatives(int[][] grid) {
         if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int row=grid.length-1;                        
        int col=0;
        int count=0;       
        while(row>=0 && col<grid[0].length)
        {
            if(grid[row][col]<0)
            {
                count += (grid[0].length - col);
                row--;
            }
            else
            {
                col++;
            }
        }
        return count;
    }
}