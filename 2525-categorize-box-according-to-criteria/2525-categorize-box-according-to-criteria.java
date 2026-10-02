class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long vol=(long)length * width * height;
        boolean isbulky=false;
        if(length>=10000 || height>=10000 || width>=10000 || vol>=1000000000)
        {
            isbulky=true;
        }
        boolean isheavy=false;
        if(mass>=100)
        {
            isheavy=true;
        }
        if(isbulky && isheavy) 
        {
            return "Both";
        }
        if(!isbulky && !isheavy) 
        {
            return "Neither";
        }
        if(isbulky) 
        {
            return "Bulky";
        }
        return "Heavy";
    }
}