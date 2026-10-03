class Solution:
    def findMaximizedCapital(self, k: int, w: int, profits: list[int], capital: list[int]) -> int:
        res=w
        a=sorted(zip(capital,profits))
        print(a)
        maxheap=[]
        i=0
        while k>0:
            while i<len(a) and a[i][0]<=res:
                heapq.heappush(maxheap,-a[i][1])
                i+=1
            if not maxheap:
                break
            v=heapq.heappop(maxheap)
            res+=-v
            k-=1           
        return res
