class Solution:
    def generateParenthesis(self, n: int) -> list[str]:
        res=[]
        def dfs(op:int,cp:int,s:str)->str:
            if op==cp and op+cp==2*n:
                res.append(s)
                return
            if op<n:
                dfs(op+1,cp,s+'(')
            if cp<op:
                dfs(op,cp+1,s+')')
        dfs(0,0,"")
        return res