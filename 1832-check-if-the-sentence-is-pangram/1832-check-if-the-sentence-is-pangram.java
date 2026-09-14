class Solution { 
    public boolean checkIfPangram(String sentence) { 
        char[] ch = new char[26]; 
        int index = 0; 
        for(char c = 'a'; c <= 'z'; c++) 
        { 
            ch[index] = c; 
            index++; 
        } 
        for(char letter : ch) 
        { 
            if (sentence.indexOf(letter) == -1) 
            {
                return false;
            }
        } 
        return true;
    } 
}
