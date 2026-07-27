class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max_prod = nums[0];
        int min_prod = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            
            if (curr < 0) {
                int temp = max_prod;
                max_prod = min_prod;
                min_prod = temp;
            }
            max_prod = Math.max(curr, max_prod * curr);
            min_prod = Math.min(curr, min_prod * curr);
            result = Math.max(result, max_prod);
        }

        return result;
    }
}
