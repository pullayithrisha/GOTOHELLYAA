class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map={}
        res=[0]*2
        for i in range(len(nums)):
            t=target-nums[i]
            if t in map:
                res[0]=map[t]
                res[1]=i
                break
            else:
                map[nums[i]]=i
        return res

