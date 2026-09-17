class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxcount=0;
        for(String sent:sentences)
        {
            int count=1;
            for(char word:sent.toCharArray())
            {
                if(word==' ')
                {
                    count++;
                }
            }
            maxcount=Math.max(maxcount,count);
        }
        return maxcount;
    }
}