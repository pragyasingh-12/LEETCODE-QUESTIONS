class Solution {
    public boolean digitCount(String num) {
        int n=num.length();
        for(int i=0;i<n;i++) 
        {
            int expectedCount=num.charAt(i)-'0'; //ascii codes se
            String remainingDigits=num.replaceAll("[^" + i + "]", "");
            int actualCount=remainingDigits.length();
            if (actualCount != expectedCount) 
            {
                return false;
            }
        }

        return true;
    }
}
