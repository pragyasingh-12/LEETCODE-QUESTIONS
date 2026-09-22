class Solution {
    public char findTheDifference(String s, String t) {
        char[] sa=s.toCharArray();
        char[] ta=t.toCharArray();
        for(int i=0;i<ta.length;i++)
        {
            char curr=ta[i];
            boolean found=false;
            for(int j=0;j<sa.length;j++)
            {
                if(sa[j]==curr)
                {
                    found=true;
                    sa[j]=' ';
                    break;
                }
            }
            if(!found)
            {
                return curr;
            }
        }
        return ' ';
    }
}