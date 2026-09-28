class Solution:
    def maxDepth(self, s: str) -> int:
        res=c=0
        for i in s:
            if i=='(':
                c+=1
            elif i==')':
                res=max(c,res)
                c-=1
        return res
