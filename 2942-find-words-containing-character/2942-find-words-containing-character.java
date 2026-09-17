class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        int i=0;
        for(String sent:words)
        {
            int count=0;
            for(char word:sent.toCharArray())
            {
                if(word==x)
                {
                    count++;
                }
            }
            if(count>0)
            {
                result.add(i);
            }
            i++;
        }
        return result;
    }
}