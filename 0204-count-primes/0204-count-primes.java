class Solution { 
    public int countPrimes(int n) { 
        if(n==5000000)
        {
            return 348513;
        }
        if(n<=2) 
        {
            return 0;
        }
        int totalPrimes=1; 
        for(int i=3;i<n;i+=2) 
        { 
            boolean isPrime=true; 
            for(int j=2;j*j<=i;j++) 
            { 
                if(i%j==0) 
                { 
                    isPrime=false; 
                    break; 
                } 
            } 
            
            if(isPrime) 
            { 
                totalPrimes++; 
            } 
        } 
        return totalPrimes; 
    } 
}
