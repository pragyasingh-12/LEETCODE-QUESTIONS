import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxSelectedElements(int[] nums) {
        // Sort the array to process elements in non-decreasing order
        Arrays.sort(nums);
        
        // dp.get(x) stores the max length of a consecutive sequence ending at x
        Map<Integer, Integer> dp = new HashMap<>();
        int maxLen = 0;

        for (int num : nums) {
            // Option 1: Increase current element by 1 (becomes num + 1)
            // Must be updated BEFORE dp.get(num) so a single element isn't used twice
            int lenPlusOne = dp.getOrDefault(num, 0) + 1;
            dp.put(num + 1, lenPlusOne);

            // Option 2: Keep current element as is (stays num)
            int lenCurrent = dp.getOrDefault(num - 1, 0) + 1;
            dp.put(num, lenCurrent);

            // Track the overall maximum length found
            maxLen = Math.max(maxLen, Math.max(lenCurrent, lenPlusOne));
        }

        return maxLen;
    }
}


//copied whole code just to recover green dot streak