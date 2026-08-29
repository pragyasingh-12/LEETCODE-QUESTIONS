class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int n = grid[0].length;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < n; j++) {
                if (((i == j || i + j == n - 1) && grid[i][j] == 0) || 
                    ((i != j && i + j != n - 1) && grid[i][j] != 0)) {
                    return false;
                }
            }
        }
        return true;
    }
}
