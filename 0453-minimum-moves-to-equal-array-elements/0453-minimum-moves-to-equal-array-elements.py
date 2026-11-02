class Solution:
    def minMoves(self, nums: list[int]) -> int:
        # s=set(nums)
        # n=len(nums)
        # res=0
        # nums.sort()
        # if len(s)==1:
        #     return 0
        # while True:
        #     i=0
        #     while i<n-1:
        #         nums[i]=nums[i]+1
        #         i+=1
        #     res+=1
        #     nums.sort()
        #     s1=set(nums)
        #     if len(s1)==1:
        #         return res
        m=min(nums)
        s=0
        for i in range(len(nums)):
            nums[i]=nums[i]-m
            s+=nums[i]
        return s
            
            
            

        