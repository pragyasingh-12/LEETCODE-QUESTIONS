class Solution {
    public int compress(char[] chars) {
        String str = new String(chars);
        String newstr="";
        for(int i=0;i<str.length();i++)
        {
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }
            newstr+=str.charAt(i);
            if(count>1)
            {
                newstr+=count.toString();
            }
        }
        String n = newstr;
        String[] ar = n.split("");

        for(int j=0;j<ar.length;j++)
        {
             chars[j] = ar[j].charAt(0);
        }
        return ar.length;
    }
}