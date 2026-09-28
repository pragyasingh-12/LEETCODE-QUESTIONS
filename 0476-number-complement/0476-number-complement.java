class Solution {
    public int findComplement(int num) {
        int n=num-(Integer.highestOneBit(num)<<1)+1;
        return (~n) + 1;
    }
}
