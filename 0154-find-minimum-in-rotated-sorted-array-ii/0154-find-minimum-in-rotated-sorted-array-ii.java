class Solution {
    public int findMin(int[] nums) {
        int min=nums[0];
        int start = 0; 
        int end = nums.length - 1; 
        while (start <= end) { 
            int mid = start + (end - start) / 2;
            min = Math.min(min, nums[mid]); 
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                min = Math.min(min, nums[mid]);
                start++;
                end--;
                continue;
            }
            if (nums[start] <= nums[mid]) { 
                if (min >= nums[start] && nums[start] < nums[end]) { 
                    min = Math.min(min, nums[start]);
                    end = mid - 1; 
                } else { 
                    start = mid + 1;
                } 
            } 
            else { 
                if (min > nums[mid] && nums[mid] <= nums[end]) {
                    min = Math.min(min, nums[mid]); 
                    start = mid + 1; 
                } else { 
                    end = mid - 1; 
                } 
            } 
        } 
        return min; 
    }
}