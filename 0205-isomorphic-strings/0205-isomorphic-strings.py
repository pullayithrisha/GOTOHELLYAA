class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False
        d1={}
        d2={}
        for i in range(len(s)):
            if s[i] not in d1:
                d1[s[i]]=i
            if t[i] not in d2:
                d2[t[i]]=i
            if d1[s[i]]!=d2[t[i]]:
                return False
            #print("d1",d1,"d2",d2)
        return True