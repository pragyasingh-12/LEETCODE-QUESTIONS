class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<asteroids.length;i++)
        {
            boolean val=false;
            while(!stack.isEmpty() && stack.peek()>0 && asteroids[i]<0)
            {
                if(stack.peek()<Math.abs(asteroids[i]))
                {
                    stack.pop();
                }
                else if(stack.peek()==Math.abs(asteroids[i]))
                {
                    stack.pop();
                    val=true;
                    break;
                }
                else
                {
                    val=true;
                    break;
                }
            }
            if(!val)
            {
                stack.push(asteroids[i]);
            }
        }
        int[] res=new int[stack.size()];
        for(int i=res.length-1;i>=0;i--)
        {
            res[i]=stack.pop();
        }
        return res;
    }
}