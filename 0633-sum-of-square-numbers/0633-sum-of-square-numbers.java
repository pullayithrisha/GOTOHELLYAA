class Solution {
    public boolean judgeSquareSum(int c) {
        int n=(int)Math.sqrt(c);
        long l=0;
        long r=n;
        while(l<=r)
        {
            long v=l*l+r*r;
            if(v==c)
            {
                return true;
            }
            else if(v>c)
            {
                r--;
            }
            else
            {
                l++;
            }
        }
        return false;
    }
}