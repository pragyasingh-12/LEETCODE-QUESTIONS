class Solution {
    public int bitwiseComplement(int n) {
        if (n == 0) {
            return 1;
        }
        int a = 0;
        int shift = 0;
        while (n > 0) {
            int b = n & 1;
            if (b != 0) {
                int c = n >> 1;
                n = c;
            } else {
                int c = n >> 1;
                n=c;
                a = a + (1 << shift);
            }
            shift++;
        }
        return a;
    }
}