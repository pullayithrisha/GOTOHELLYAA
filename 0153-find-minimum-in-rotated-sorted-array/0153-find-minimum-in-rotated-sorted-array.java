class Solution {
    public int findMin(int[] nums) {
        // brute force
        //int res=Integer.MAX_VALUE;
        // for(int i:nums)
        // {
        //     res=Math.min(res,i);
        // }

        int l=0;
        int r=nums.length-1;
        while(l<r)
        {
            int m=l+(r-l)/2;
            if(nums[m]>nums[r])
            {
                l=m+1;
            }
            else
            {
                r=m;
            }
            System.out.println("l:"+l+" r:"+r);
        }
        return nums[l];
    }
}