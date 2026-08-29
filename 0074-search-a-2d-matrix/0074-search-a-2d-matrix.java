class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix[0].length==0 || matrix.length==0)
        {
            return false;
        }
        int num_of_rows=matrix.length;;
        int num_of_cols=matrix[0].length;
        int start=0;
        int end=(num_of_rows * num_of_cols) - 1;
        while(start<=end)
        {
            int mid=start + (end-start)/2;
            int row=mid/num_of_cols;
            int col=mid%num_of_cols;
            int midvalue=matrix[row][col];
            if(midvalue==target)
            {
                return true;
            }
            else if(midvalue>target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return false;
    }
}