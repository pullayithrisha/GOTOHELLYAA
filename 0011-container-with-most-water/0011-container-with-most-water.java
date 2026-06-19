class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int res=Integer.MIN_VALUE;
        while(l<r)
        {
            int mini=Math.min(height[l],height[r]);
            int water= ((r-l)*mini);
            res=Math.max(res,water);
             if(height[l]<height[r])
            {
                l++;
            }
            else{
                r--;
            }
        }
        return res;
    }
}