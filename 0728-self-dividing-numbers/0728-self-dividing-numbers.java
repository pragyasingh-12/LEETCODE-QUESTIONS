class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
         List<Integer> ans = new ArrayList<>();

        for(int i = left; i <= right; i++)
        {
            int temp = i;
            int original = i;

            boolean selfDividing = true;

            while(temp > 0)
            {
                int ld = temp % 10;

                if(ld == 0 || original % ld != 0)
                {
                    selfDividing = false;
                    break;
                }

                temp = temp / 10;
            }
             if(selfDividing)
            {
                ans.add(original);
            }
        }

        return ans;
    }
}
