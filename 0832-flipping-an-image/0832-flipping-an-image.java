class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int mat[][]=new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++)
        {
            int k=image[0].length-1;
            for(int j=0;j<image[0].length;j++)
            {
               mat[i][j]=image[i][k];
               k--;
            }
        }
        for(int i=0;i<image.length;i++)
        {
            for(int j=0;j<image[0].length;j++)
            {
                if(mat[i][j]==0)
                {
                    mat[i][j]=1;
                }
                else
                {
                    mat[i][j]=0;
                }
            }
        }
        return mat;
    }
}