class Solution:
    def longestMonotonicSubarray(self, nums: List[int]) -> int:
        si=sd=1
        n=len(nums)
        for i in range(n):
            for j in range(i+1,n):
                    sa=nums[i:j+1]
                    f=sa[0]
                    se=sa[1]
                    if f>se:
                        de=True
                        idx=1
                        while idx<len(sa)-1:
                            if sa[idx]<=sa[idx+1]:
                                de=False
                                break
                            idx+=1
                        if de:
                            sd=max(sd,len(sa))
                    elif f<se:
                        ie=True
                        idx=1
                        while idx<len(sa)-1:
                            if sa[idx]>=sa[idx+1]:
                                ie=False
                                break
                            idx+=1
                        if ie:
                            si=max(si,len(sa))
                    else:
                        break
        return max(sd,si)