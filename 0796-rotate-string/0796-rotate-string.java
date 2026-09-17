import java.util.Arrays;

class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) 
        {
            return false;
        }
        char[] ch1 = s.toCharArray();
        char[] ch2 = goal.toCharArray();
        for (int i = 0; i < ch1.length; i++) 
        {
            if (Arrays.equals(ch1, ch2)) 
            {
                return true;
            }
            rotateLeft(ch1);
        }
        return false;
    }
    
    private void rotateLeft(char[] arr) 
    {
        char first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) 
        {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
    }
}
