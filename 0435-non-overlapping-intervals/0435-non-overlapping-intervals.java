class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,Comparator.comparing(o->o[1]));
        int res=0;
        int p=intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            int c=intervals[i][0];
            if(c<p)
            {
                res+=1;
            }
            else{
                p=intervals[i][1];
            }
        }
        return res;
    }
}