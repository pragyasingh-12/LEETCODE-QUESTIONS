import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) 
        {
            if (result.size() == 2) {
                break;
            }
            if (result.contains(nums[i])) 
            {
                continue;
            }
            int count = 0; 
            for (int j = 0; j < nums.length; j++) 
            {
                if (nums[j] == nums[i]) 
                {
                    count++;
                }
            }
            if (count > (n / 3)) 
            {
                result.add(nums[i]);
            }
        }
        return result; 
    }
}
