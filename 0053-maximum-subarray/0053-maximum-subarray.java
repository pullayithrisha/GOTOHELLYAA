class Solution {
    public int maxSubArray(int[] nums) {
        int res=Integer.MIN_VALUE;
        int sum=0;
        int l=0;
        for(int r=0;r<nums.length;r++)
        {
            sum=Math.max(nums[r],sum+nums[r]);
            res=Math.max(res,sum);
        }
        return res;
    }
}