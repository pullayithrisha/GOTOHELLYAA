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
        // for(int i=0;i<intervals.length;i++)
        // {
        //     boolean covered=false;
        //     for(int j=0;j<intervals.length;j++)
        //     {
        //         if(i!=j && covered(intervals[i],intervals[j]))
        //         {
        //             covered=true;
        //             break;
        //         }
        //     }
        //     if(!covered)
        //     {
        //         res++;
        //     }
        // }
        Arrays.sort(intervals,(a,b)->{
        if(a[0]==b[0]) return Integer.compare(b[1],a[1]);
        return Integer.compare(a[0],b[0]);
     });  
        for (int i = 0; i < intervals.length; i++) {
    System.out.println(java.util.Arrays.toString(intervals[i]));
}
        int maxEnd=0;

     for(int[] i:intervals){
        if(i[1]>maxEnd){
            res++;
            maxEnd=i[1];
        }
     }
        return res;
    }
}