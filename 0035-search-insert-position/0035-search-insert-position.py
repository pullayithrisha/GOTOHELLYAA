class Solution:
    def searchInsert(self, nums: list[int], target: int) -> int:
        res=-1
        l=0
        n=len(nums)
        r=n-1
        while l<=r:
            m=l+(r-l)//2
            if nums[m]==target:
                return m
            if nums[m]>target:
                r=m-1
            else:
                l=m+1
        #print("l:",l," r:",r)
        return l