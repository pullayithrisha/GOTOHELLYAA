class Solution:
    def eraseOverlapIntervals(self, intervals: list[list[int]]) -> int:
        intervals.sort(key=lambda o:o[1])
        print(intervals)
        res=0
        pre=intervals[0][1]
        for i in range(1,len(intervals)):
            cur=intervals[i][0]
            if cur<pre:
                res+=1
            else:
                pre=intervals[i][1]
        return res


