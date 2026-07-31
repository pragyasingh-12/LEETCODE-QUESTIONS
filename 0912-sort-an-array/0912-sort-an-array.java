class Solution {
    public int[] sortArray(int[] nums) {
        if (nums == null || nums.length == 0) {
        return nums;
        }
         int largest = Integer.MIN_VALUE;
         int smallest= Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            largest=Math.max(largest, nums[i]);
            smallest = Math.min(smallest, nums[i]);
        }
        int range = largest - smallest + 1;
        int count[]=new int[range];
        for(int i=0;i<nums.length;i++)
        {
            count[nums[i]-smallest]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++)
        {
            while (count[i]>0) {
                nums[j]=i+smallest;
                j++;
                count[i]--;
            }
        }
        return nums;
    }
}
