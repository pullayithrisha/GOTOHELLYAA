class Solution:
    def createGrid(self, m: int, n: int) -> list[str]:
        res=[]
        for i in range(m):
            p=""
            for j in range(n):
                if j==0 or i==m-1:
                    p+="."
                else:
                    p+="#"
            res.append(p)
        print(p)
        return res
