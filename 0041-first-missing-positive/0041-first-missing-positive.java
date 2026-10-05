import java.util.HashSet;

class Solution {
    public int firstMissingPositive(int[] nums) {
        // Use a Set to remove duplicates and find unique valid positives
        HashSet<Integer> uniquePositives = new HashSet<>();
        for(int i:nums) 
        {
            if(i>0&&i<=nums.length) 
            {
                uniquePositives.add(i);
            }
        }
        int missingnum=1;
        while(uniquePositives.contains(missingnum))
        {
            missingnum++;
        }
        return missingnum;  //agr 1 nhi h to jo missing element h use seedha add krdo
    }
}
