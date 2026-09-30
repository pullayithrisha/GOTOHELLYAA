class Solution:
    def singleNonDuplicate(self, nums: List[int]) -> int:
        l=0
        n=len(nums)
        r=n-1
        while l<=r:
            m=l+(r-l)//2
            if m+1<n and nums[m]==nums[m+1]:
                if m%2!=0:
                    r=m-1
                else:
                    l=m+1
            elif m-1>-1 and nums[m]==nums[m-1]:
                if m%2==0:
                    r=m-1
                else:
                    l=m+1
            else:
                return nums[m]
        