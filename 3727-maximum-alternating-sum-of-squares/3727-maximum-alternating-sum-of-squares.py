class Solution:
    def maxAlternatingSum(self, nums: List[int]) -> int:
        nums=[abs(x) for x in nums]
        nums.sort(reverse=True)
        a=[x*x for x in nums]
        print("a:",a)
        res=0
        i=0
        j=len(nums)-1
        while i<=j:
            if i==j:
                res+=a[i]
            else:
                v=a[i]-a[j]
                res+=v
            i+=1
            j-=1
        return res
