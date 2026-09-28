class Solution:
    def rotate(self, nums: list[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        def rev(a:list[int],i:int,j:int):
            l=i
            r=j
            while l<=r:
                a[l],a[r]=a[r],a[l]
                l+=1
                r-=1
        n=len(nums)
        k=k%n
        rev(nums,0,n-k-1)
        rev(nums,n-k,n-1)
        rev(nums,0,n-1)
        return nums



        