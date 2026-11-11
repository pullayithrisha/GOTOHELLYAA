class Solution:
    def majorityElement(self, nums: list[int]) -> int:
        hm={}
        n=len(nums)
        for i in nums:
            if i in hm:
                hm[i]+=1
            else:
                hm[i]=1
        for k,c in hm.items():
            if c>n//2:
                return k