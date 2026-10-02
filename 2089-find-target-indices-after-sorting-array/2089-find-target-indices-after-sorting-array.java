class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
       Arrays.sort(nums);
       List<Integer> result = new ArrayList<>();
       int left=0;
       int right=nums.length-1;
       int firstindex=-1;
       while(left<=right)
       {
        int mid=left+(right-left)/2;
        if(nums[mid]==target)
        {
            firstindex=mid;
            right=mid-1;
        }
        else if(nums[mid] < target) 
        { 
            left=mid+1; 
        }
        else 
        { 
            right=mid-1; 
        } 
       }
       if(firstindex!=-1)
       {
        while(firstindex<nums.length && nums[firstindex]==target)
        {
            result.add(firstindex);
            firstindex++;
        }
       }
       return result;
    }
}