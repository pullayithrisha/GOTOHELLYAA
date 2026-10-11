class Solution:
    def sumOfSquares(self, nums: List[int]) -> int:
        n=len(nums)
        res=0
        for i in range(n):
            if n%(i+1)==0:
                v=nums[i]*nums[i]
                res+=v
        return res