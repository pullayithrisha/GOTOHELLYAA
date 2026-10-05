class Solution:
    def convert(self, s: str, R: int) -> str:
        if R==1 or R>=len(s):
            return s
        res=""
        arays=[]
        for i in range(R):
            arays.append([])
        print(arays)
        i=0
        while i<len(s):
            for j in range(R):
                if i<len(s):
                    v=s[i]
                    arays[j].append(v)
                    i+=1
            for k in range(R-2,0,-1):
                if i<len(s):
                    v=s[i]
                    arays[k].append(v)
                    i+=1
        res="".join("".join(r) for r in arays)
        return res