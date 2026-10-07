class Solution:
    def separateDigits(self, nums: list[int]) -> list[int]:
        res=[]
        for i in nums:
            if i<=9:
                res.append(i)
            else:
                s=str(i)
                for j in s:
                    res.append(int(j))            
        return res