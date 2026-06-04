class Solution {
    public int maxProfit(int[] prices) {
        //brute force
        int res=0;
        // for(int i=0;i<prices.length;i++)
        // {
        //     for(int j=i+1;j<prices.length;j++)
        //     {
        //         int p=prices[j]-prices[i];
        //         if(p>res)
        //         {
        //             res=p;
        //         }
        //     }
        // }
        // return res;
        int lowestp=0;
        int i=1;
        for(i=1;i<prices.length;i++)
        {
            int p=prices[i]-prices[lowestp];
            if(p>res){
                res=p;
            }
            if(prices[i]<prices[lowestp])
            {
                lowestp=i;
            }
        }
        return res;

    }
}