class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        int start=0;
        int end=arr.length-1;
        int k=0;
        int[] count=new int[arr.length];
        while(start<=end)
        {
            int count1=1;
            int count2=1;
            while( start+1<=end && arr[start]==arr[start+1])
            {
                count1++;
                start++;
            }
            if(start==end) 
            {
                count[k++]=count1;
                break;
            }
            while(end-1>start && arr[end]==arr[end-1])
            {
                count2++;
                end--;
            }
            if(count1==count2)
            {
                return false;
            }
            count[k++]=count1;
            count[k++]=count2;
            start++;
            end--;
        }
            // now sort the counts and check duplicates(agr count repaeat hua to false)
            Arrays.sort(count,0,k);
            for(int i=0;i<k-1;i++)
            {
                if(count[i]==count[i+1])
                {
                    return false;
                }
            }
        return true;
    }
}