import java.util.ArrayList;

class Solution {
    public boolean isPathCrossing(String path) {
        int x=0;
        int y=0;
        ArrayList<String> list = new ArrayList<>();
        list.add(x + "," + y);
        for(int i=0;i<path.length();i++)
        {
            if(path.charAt(i)=='N')
            {
                y++;
            }
            else if(path.charAt(i)=='S')
            {
                y--;
            }
            else if(path.charAt(i)=='E')
            {
                x++;
            }
            else
            {
                x--;
            }
            String current = x + "," + y;
            if(list.contains(current))
            {
                return true;
            }
            list.add(current);
        }
        return false;
    }
}
