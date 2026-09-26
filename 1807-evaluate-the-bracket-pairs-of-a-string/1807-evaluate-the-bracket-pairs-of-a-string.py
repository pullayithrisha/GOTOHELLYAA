class Solution:
    def evaluate(self, s: str, knowledge: list[list[str]]) -> str:
        hm={}
        n=len(s)
        i=0
        res=""
        while i<n:
            if s[i]=='(':
                k=""
                j=i+1
                while s[j]!=')':
                    k+=s[j]
                    j+=1
                hm[k]='?'
                i=j
            else:
                i+=1
        # print(hm)
        for i in range(len(knowledge)):
            ke=knowledge[i][0]
            val=knowledge[i][1]
            if ke in hm:
                hm[ke]=val
        #print(hm)
        i=0
        while i<n:
            if s[i]!='(':
                res+=s[i]
                i+=1
            else:
                k1=""
                j=i+1
                while s[j]!=')':
                    k1+=s[j]
                    j+=1
                #print("j",j)
                i=j+1
                a=hm[k1]
                res+=a
        return res


