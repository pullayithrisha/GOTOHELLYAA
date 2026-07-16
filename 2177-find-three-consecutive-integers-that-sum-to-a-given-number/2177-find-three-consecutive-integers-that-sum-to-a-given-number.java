class Solution {
    public long[] sumOfThree(long num) {
        long res[]=new long[3];
        // long l=0;
        // long r=num;
        // while(l<=r)
        // {
        //     long m=l+(r-l)/2;
        //     long sum= 3*m;
        //     if(sum==num)
        //     {
        //         res[0]=m-1;
        //         res[1]=m;
        //         res[2]=m+1;
        //         return res;
        //     }  
        //     if(sum>num)
        //     {
        //         r=m-1;
        //     }
        //     else 
        //     {
        //         l=m+1;
        //     }
        // }
        if(num%3!=0)
        {
            return new long[0];
        }
        long x=num/3;
        res[0]=x-1;
        res[1]=x;
        res[2]=x+1;
        return  res;
         
    }
}