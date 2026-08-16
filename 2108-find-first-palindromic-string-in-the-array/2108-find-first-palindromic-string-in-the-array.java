class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++)
        {
            String original=words[i];
            
            int left=0;
            int right=original.length()-1;
            boolean isPalindrome=true;

            while(left<right)
            {
                if(original.charAt(left)!=original.charAt(right))
                {
                    isPalindrome=false;
                    break;
                }
                left++;
                right--;
            }
            if(isPalindrome)
            {
                return original;
            }
        }
        return "";
    }
}