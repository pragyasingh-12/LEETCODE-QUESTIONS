class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        int prev=0;
        for(int i=0;i<nums.length;i++) 
        {
            if(nums[i]==prev) 
            {
                continue;
            }
            while((prev+1)!=nums[i]) 
            {
                result.add(prev+1);
                prev++;
            }
            prev=nums[i];
        }
        while(prev<nums.length) 
        {
            result.add(prev+1);
            prev++;
        }
        return result;
    }
}
