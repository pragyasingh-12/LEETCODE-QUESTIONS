class Solution {
    public int maximumWealth(int[][] accounts) {
        int largest=0;
        for(int i=0;i<accounts.length;i++)
        {
            int sum=0;
            for(int j=0;j<accounts[0].length;j++)
            {
                sum=sum+accounts[i][j];
                largest=Math.max(sum,largest);
            }
        }
        return largest;
    }
}