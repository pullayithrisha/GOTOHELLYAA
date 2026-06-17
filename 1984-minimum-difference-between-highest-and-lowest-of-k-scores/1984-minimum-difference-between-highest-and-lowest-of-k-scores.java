class Solution {
    public int minimumDifference(int[] nums, int k) {
           Arrays.sort(nums);
        int res=Integer.MAX_VALUE;
        int l=0;
        int r=0;
        while(r<nums.length)
        {
            if((r-l+1)==k)
            {
                int min=nums[r]-nums[l];
                res=Math.min(min,res);
            }
            r++;
            if(r+1>k)
            {
                l++;
            }
        }
        return res;

    }
}