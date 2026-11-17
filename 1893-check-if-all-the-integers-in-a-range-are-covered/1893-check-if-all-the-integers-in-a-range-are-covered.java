class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        Arrays.sort(ranges, (x, y) -> Integer.compare(x[0], y[0]));

        for (int[] range : ranges) {
            if (left > right) {
                return true;
            }
            if (range[0] > left) {
                return false;
            }
            left = Math.max(left, range[1] + 1);
        }

        return left > right;
    }
}
