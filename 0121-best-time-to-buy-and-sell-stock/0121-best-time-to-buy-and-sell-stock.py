class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        res=0
        mini=prices[0]
        for i in range(len(prices)):
            if prices[i]<mini:
                mini=prices[i]
            res=max(res,prices[i]-mini)
        return res
            