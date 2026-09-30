import java.util.Arrays;

class Solution { 
    public int[] intersect(int[] nums1, int[] nums2) { 
        int[] tempArr = new int[Math.min(nums1.length, nums2.length)];
        int count = 0; 
        for (int j = 0; j < nums2.length; j++) 
        { 
            for (int i = 0; i < nums1.length; i++) 
            { 
                if (nums2[j] == nums1[i]) 
                {
                    tempArr[count] = nums1[i]; 
                    count++; 
                    nums1[i] = Integer.MIN_VALUE; //taki dubara check ho to same value match na ho....to remove duplication
                    break; 
                } 
            } 
        } 
        int[] ans = new int[count];
        for (int k = 0; k < count; k++) 
        {
            ans[k] = tempArr[k];
        }
        
        return ans; 
    } 
}
