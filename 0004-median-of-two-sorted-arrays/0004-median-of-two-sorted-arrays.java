class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] arr=new int[m+n];
        int index=0;
        for(int i=0;i<m;i++)
        {
            arr[i]=nums1[i];
        }
        for(int i=0;i<n;i++)
        {
            arr[m+i]=nums2[i];
        }
        Arrays.sort(arr);
        if(((m+n)%2)!=0)
        {
            int mid=(m+n)/2;
            double value=(double)arr[mid];
            return value;
        }
        else
        {
            int mid=(m+n)/2;
            double value=(double)(arr[mid]+arr[mid-1])/2;
            return value;
        }
    }
}