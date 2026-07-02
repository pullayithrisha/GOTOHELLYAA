class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int res=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++)
        //     {
        //         sum+=nums[j];
        //         if(sum%k==0)
        //         {
        //             res++;
        //         }
        //     }
        // }
        // return res;

        //optimal
        int sum=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        for(int i:nums)
        {
            sum=(sum+i%k+k)%k;
            if(hm.containsKey(sum))
            {
                res+=hm.get(sum);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return res;
    }
}