class Solution {
    public int maxSubArray(int[] nums) {
        int res=Integer.MIN_VALUE;
        int sum=0;
        int l=0;
        for(int r=0;r<nums.length;r++)
        {
            sum+=nums[r];
            if(sum>res)
            {
                res=sum;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        return res;
    }
}