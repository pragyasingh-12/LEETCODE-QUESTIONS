class Solution {
    public void setZeroes(int[][] matrix) {
        int placeholder = 99999; 
        int x = 0;
        int y = 0;
        while (x < matrix.length) {
            y = 0;
            while (y < matrix[0].length) {
                if (matrix[x][y] == 0) {
                    int col = 0;
                    while (col < matrix[0].length) {
                        if (matrix[x][col] != 0) matrix[x][col] = placeholder;
                        col++;
                    }
                    int row = 0;
                    while (row < matrix.length) {
                        if (matrix[row][y]!=0) matrix[row][y] = placeholder;
                        row++;
                    }
                }
                y++;
            }
            x++;
        }
        x = 0;
        while (x < matrix.length) {
            y = 0;
            while (y < matrix[0].length) {
                if (matrix[x][y] == placeholder) {
                    matrix[x][y] = 0;
                }
                y++;
            }
            x++;
        }
    }
}
