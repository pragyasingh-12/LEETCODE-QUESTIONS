class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[] colMax = new int[n];
        for (int j = 0; j < n; j++) 
        {
            int largest = -1;
            for (int i = 0; i < m; i++) 
            {
                largest = Math.max(largest, matrix[i][j]);
            }
            colMax[j] = largest;
        }
        int[][] ans=new int[m][n];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==-1)
                {
                    ans[i][j]=colMax[j];
                }
                else
                {
                    ans[i][j]=matrix[i][j];
                }
            }
        }
        return ans;
    }
}