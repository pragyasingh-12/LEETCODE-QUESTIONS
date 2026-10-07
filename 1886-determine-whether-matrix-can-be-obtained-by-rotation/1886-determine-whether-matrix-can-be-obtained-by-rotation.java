class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        if (mat.length != target.length || mat[0].length != target[0].length) {
            return false;
        }
        for (int rotations = 0; rotations < 4; rotations++) {
            if (Arrays.deepEquals(mat, target)) //poori 2d k saare elemets ko check krenge dono array me
            {
                return true;
            }
            for (int i = 0; i < mat.length; i++) {
                for (int j = i; j < mat.length; j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length / 2; j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[i][mat.length - 1 - j];
                    mat[i][mat.length - 1 - j] = temp;
                }
            }
        }
        return false;
    }
}
