class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); 
        ArrayList<int[]> res=new ArrayList<>();
        for(int i=0;i<intervals.length;i++)
        {
            int start=intervals[i][0];
            int end=intervals[i][1];
            if(!res.isEmpty() && start<=res.get(res.size()-1)[1])
            {
                continue;
            }
            for(int j=i+1;j<intervals.length;j++)
            {
                if(intervals[j][0]<=end)
                {
                    end=Math.max(intervals[j][1],end);
                }
                else
                {
                    break;
                }
            }
            res.add(new int[]{start,end});
        }
        return res.toArray(new int[res.size()][]);
    }
}