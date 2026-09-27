class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int ans[]=new int[n];
        k=k%n;    //agr k n se bda hua islie (if condition fail hojaegi cuz default value aajaengi fir ans me)
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=nums[(i+n-k)%n];
        }
        for(int i=0;i<ans.length;i++)
        {
            nums[i]=ans[i];
        }
    }
}