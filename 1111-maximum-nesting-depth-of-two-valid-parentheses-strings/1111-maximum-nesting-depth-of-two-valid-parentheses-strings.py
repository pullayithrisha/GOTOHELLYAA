class Solution:
    def maxDepthAfterSplit(self, seq: str) -> list[int]:
        c=0
        res=[]
        # a,b=[],[]
        # for i in range (len(seq)):
        #     if seq[i]=='(':
        #         c+=1
        #         if c%2!=0:
        #             a.append(i+1)
        #         else:
        #             b.append(i+1)
        #     else: 
        #         if c%2!=0:
        #                 a.append(i+1)
        #         else:
        #                 b.append(i+1)
        #         c-=1+
        # # print(a)
        # # print(b)
        # for i in range(1,len(seq)+1):
        #     if i in a:
        #         res.append(0)
        #     else:
        #         res.append(1)
        # return res
        for i in range (len(seq)):
            if seq[i]=='(':
                c+=1
                res.append(c%2)
            else: 
                res.append(c%2)
                c-=1
        return res

 