class Solution:
    def bestHand(self, ranks: list[int], suits: list[str]) -> str:
        s1=set(ranks)
        s2=set(suits)
        if len(s2)==1:
            return "Flush"
        t=False
        p=False
        for i in ranks:
            if ranks.count(i)>2:
                t=True
            if ranks.count(i)>1:
                p=True
        if t:
            return "Three of a Kind"
        if p:
            return "Pair"
        return "High Card"