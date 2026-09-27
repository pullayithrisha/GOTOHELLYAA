class Solution:
    def minOperations(self, nums: list[int]) -> int:
        # res=10**10
        # n=len(nums)
        # for i in nums:
        #     mini=i
        #     t=mini+n-1
        #     c=0
        #     hs=set()
        #     for j in nums:
        #         if j<mini or j>t or j in hs:
        #             c+=1
        #         hs.add(j)
        #     res=min(res,c)
        # return res
        def bs(a:list[int],i:int,j:int,t:int)->int:
            l=i
            r=j
            while l<=r:
                m=l+(r-l)//2
                if a[m]<=t:
                    l=m+1
                else:
                    r=m-1
            return l
        n=len(nums)
        res=n
        hs=set(nums)
        nums=sorted(set(nums))
        n1=len(nums)
        for i in range(n1):
            mini=nums[i]
            t=mini+n-1
            j=bs(nums,i,n1-1,t)
            bounded=j-i
            rem=n-bounded
            res=min(res,rem)
        return res


