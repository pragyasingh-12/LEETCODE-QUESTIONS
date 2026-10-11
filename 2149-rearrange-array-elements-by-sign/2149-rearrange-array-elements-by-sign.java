import java.util.ArrayList;
class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        int temp[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                result.add(nums[i]);
            }
        }
        int negPointer = 0;
        int posPointer = 0;
        for(int i=0;i<temp.length;i++)
        {
            if(i%2!=0)
            {
                temp[i]=result.get(negPointer);
                negPointer++; 
            }
            else
            {
                while(nums[posPointer]<0)
                {
                    posPointer++;
                }
                temp[i]=nums[posPointer];
                posPointer++;
            }
        }
        return temp;
    }
}