class Solution {
    public int minimumSwaps(int[] nums) {
        int count = 0;
        int left = 0;
        int right = nums.length - 1;
        int start = 0;
        int end = nums.length - 1;
        while (start < end) 
        {
            if (nums[left] != 0) 
            {
                left++;
                start++;
            } 
            else if (nums[right] == 0) 
            {
                right--;
                end--;
            } 
            else 
            {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                
                count++; 
                left++;
                right--;
                start++;
                end--;
            }
        }
        return count;
    }
}
