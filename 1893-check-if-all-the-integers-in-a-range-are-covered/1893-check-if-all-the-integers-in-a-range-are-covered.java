class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        for(int x=left;x<=right;x++) 
        {
            boolean isFound=false;
            for(int[] range:ranges) {
                if(x>=range[0] && x<=range[1]) 
                {
                    isFound=true;
                    break;
                }
            }
            
            if(!isFound) 
            {
                return false;
            }
        }
        return true;
    }
}