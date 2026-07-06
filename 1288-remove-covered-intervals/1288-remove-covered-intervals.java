class Solution {
    public boolean covered(int[] a,int[] b)
    {
        if(b[0]<=a[0] && a[1]<=b[1])
        {
            return true;
        }
        return false;
    }
    public int removeCoveredIntervals(int[][] intervals) {
        int res=0;
        for(int i=0;i<intervals.length;i++)
        {
            boolean covered=false;
            for(int j=0;j<intervals.length;j++)
            {
                if(i!=j && covered(intervals[i],intervals[j]))
                {
                    covered=true;
                    break;
                }
            }
            if(!covered)
            {
                res++;
            }
        }
        return res;
    }
}