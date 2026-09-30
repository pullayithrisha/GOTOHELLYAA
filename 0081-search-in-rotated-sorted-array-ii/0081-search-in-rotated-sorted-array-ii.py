class Solution:
    def search(self, nums: list[int], target: int) -> bool:
        l=0
        n=len(nums)
        r=n-1
        while l<=r:
            m=l+(r-l)//2
            if nums[m]==target:
                return True
            if nums[l]==nums[m] and nums[r]==nums[m]:
                r-=1
                l+=1
                continue
            if nums[l]<=nums[m]:
                if target>=nums[l] and target<nums[m]:
                    r=m-1
                else:
                    l=m+1
            else:
                if target<=nums[r] and target>nums[m]:
                    l=m+1
                else:
                    r=m-1
        return False



