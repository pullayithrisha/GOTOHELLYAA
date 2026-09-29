class Solution:
    
    def searchRange(self, nums: list[int], target: int) -> list[int]:
        def lm(nums:list[int],t:int)->int:
            l=0
            n=len(nums)
            r=n-1
            res=-1
            while l<=r:
                m=l+(r-l)//2
                if nums[m]==t:
                    res=m
                    r=m-1
                elif nums[m]>t:
                    r=m-1
                else:
                    l=m+1
            print("l:",l)
            return res
        def rm(nums:list[int],t:int)->int:
            l=0
            res=-1
            n=len(nums)
            r=n-1
            while l<=r:
                m=l+(r-l)//2
                if nums[m]==t:
                    res=m
                    l=m+1
                elif nums[m]<t:
                    l=m+1
                else:
                    r=m-1
            print("r:",l)
            return res
    
        res=[-1,-1]
        l=lm(nums,target)
        r=rm(nums,target)
        res[0]=l
        res[1]=r
        return res

            