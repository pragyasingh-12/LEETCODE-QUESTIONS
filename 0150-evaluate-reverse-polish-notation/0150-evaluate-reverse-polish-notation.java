class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length==1) 
        {
            return Integer.parseInt(tokens[0]);
        }
        int len = tokens.length;
        for(int i=0;i<len;i++)
        {
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/"))
            {
                String op = tokens[i];
                int a=Integer.parseInt(tokens[i-2]);
                int b=Integer.parseInt(tokens[i-1]);
                int res=0;
                if(op.equals("+")) res=a+b;
                else if(op.equals("-")) res=a-b;
                else if(op.equals("*")) res=a*b;
                else if(op.equals("/")) res=a/b;
                tokens[i-2]=String.valueOf(res);
                for(int j=i-1;j<len-2;j++) 
                {
                    tokens[j]=tokens[j + 2];
                }
                len=len-2;
                i=-1;
            }
        }
        return Integer.parseInt(tokens[0]);
    }
}