class Solution {
    public int calPoints(String[] operations) {
        int[] scores = new int[operations.length];
        int size = 0;
        for (int i = 0; i < operations.length; i++) {
            String str = operations[i];
            if (str.equals("C")) {
                size--;
            } 
            else if (str.equals("D")) {
                scores[size] = scores[size - 1] * 2;
                size++;
            } 
            else if (str.equals("+")) {
                scores[size] = scores[size - 1] + scores[size - 2];
                size++;
            } 
            else {
                scores[size] = Integer.parseInt(str);
                size++;
            }
        }
        int totalSum = 0;
        for (int i = 0; i < size; i++) {
            totalSum += scores[i];
        }
        
        return totalSum;
    }
}