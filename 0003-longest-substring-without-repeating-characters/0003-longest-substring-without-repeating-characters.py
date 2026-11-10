class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        i=j=res=0
        hm={}
        n=len(s)
        while j<n:
            c=s[j]
            if c not in hm:
                d=j-i+1
                res=max(res,d)
                hm[c]=1
            else:
                hm[c]+=1
                while hm[c]>1:
                    hm[s[i]]-=1
                    if hm[s[i]]==0:
                        del hm[s[i]]
                    i+=1
            j+=1
        return res