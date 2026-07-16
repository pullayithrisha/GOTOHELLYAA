class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==divisor){ return 1; }
        long res=0;
        long n=Math.abs((long)dividend);
        long d=Math.abs((long)divisor);
        boolean sign=true;
        if(divisor<=0 && dividend>0) { sign=false;}
        if(dividend<=0 && divisor>0) { sign=false;}
        while(n>=d)
        {
            int c=0;
            while(n>= (d<<c+1))
            {
                c++;
            }
            res+=(1L<<c);
            n-= (d<<c);
        }
        if(res==(1L<<31) && sign) {return Integer.MAX_VALUE;}
        if(res==(1L<<31) && !sign){return Integer.MIN_VALUE; }
        return (int) (sign?res:-res);
    }
}