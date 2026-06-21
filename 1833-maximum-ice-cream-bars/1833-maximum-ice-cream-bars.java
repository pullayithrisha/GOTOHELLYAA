class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int res=0;
        for(int i:costs)
        {
            if(i<=coins)
            {
                res+=1;
                coins=coins-i;
                System.out.println("res:"+res+" coins:"+coins);

            }
        }
        return res;
    }
}