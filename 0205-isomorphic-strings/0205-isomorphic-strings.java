class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        char[] ch=s.toCharArray();
        char[] ch2=t.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            for(int j=i+1;j<ch2.length;j++)
            {
                if(ch[i]==ch[j] && ch2[i]!=ch2[j] || ch2[i]==ch2[j] && ch[i]!=ch[j])
                {
                    return false;
                }
            }
        }
        return true;
    }
}