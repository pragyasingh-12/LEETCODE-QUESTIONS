class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int applesum=0;
        int capsum=0;
        Arrays.sort(apple);
        Arrays.sort(capacity);
        for(int i=0;i<apple.length;i++)
        {
            applesum=applesum+apple[i];
        }
        int count = 0; 
        for(int i=capacity.length-1;i>=0;i--)
        {
            capsum=capsum+capacity[i];
            count++;
            if(capsum>=applesum)
            {
                return count;
            }
        }
        return capacity.length;
    }
}