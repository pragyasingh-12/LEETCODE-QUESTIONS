class Solution {
    public int largestAltitude(int[] gain) {
        int[] ans=new int[gain.length+1];
        ans[0]=0;
        int temp=0;
        int j=0;
        int max=0;
        for(int i=1;i<ans.length;i++)
        {
            ans[i]=temp+gain[j];
            if(ans[i]>max) 
            {
                max=ans[i];
            }
            j++;
            temp=ans[i];
        }
        return max;
    }
}