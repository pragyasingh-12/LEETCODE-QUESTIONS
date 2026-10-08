class Solution { 
    public int findLucky(int[] arr) { 
        int max=Integer.MIN_VALUE; 
        for (int i=0;i<arr.length;i++) 
        { 
            int count=0;
            for (int j=0;j<arr.length;j++) 
            {
                if (arr[i] == arr[j]) 
                { 
                    count++; 
                } 
            }
            if (count == arr[i]) 
            {
                if (arr[i] > max) 
                { 
                    max = arr[i]; 
                } 
            }
        } 
        return (max == Integer.MIN_VALUE) ? -1 : max; 
    } 
}
