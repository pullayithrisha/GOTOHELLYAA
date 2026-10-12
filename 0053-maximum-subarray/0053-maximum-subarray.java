class Solution {
    public int maxSubArray(int[] nums) {
        int res=Integer.MIN_VALUE;
        int curs=0;
        for(int i=0;i<nums.length;i++)
        {
            curs+=nums[i];
            if(curs>res)
            {
                res=Math.max(res,curs);
            }
            if(curs<0)
            {
                curs=0;
            }
        }
        return res;
    }
}