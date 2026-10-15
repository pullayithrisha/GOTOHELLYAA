class Solution:
    def sumCounts(self, nums: List[int]) -> int:
        res=0
        n=len(nums)
        for i in range(n):
            for j in range(i,n):
                sub=nums[i:j+1]
                s=set(sub)
                v=len(s)
                res+= (v*v)
        return res