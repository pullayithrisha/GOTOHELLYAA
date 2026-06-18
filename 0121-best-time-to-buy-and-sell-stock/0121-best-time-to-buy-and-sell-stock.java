class Solution {
    public int maxProfit(int[] prices) {
        int res=Integer.MIN_VALUE;
        if(prices.length<=1){return 0;}
        int lowestp=prices[0];
        for(int i=1;i<prices.length;i++)
        {

            if(prices[i]<lowestp)
            {
                lowestp=prices[i];
            }
            res=Math.max(res,prices[i]-lowestp);
        }
        return res;
    }
}