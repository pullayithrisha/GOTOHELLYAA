class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int res=0;
        // int premax[]=new int[n];
        // int sufmax[]=new int[n];
        // premax[0]=height[0];
        // for(int i=1;i<n;i++)
        // {
        //     premax[i]=Math.max(premax[i-1],height[i]);
        // }
        // sufmax[n-1]=height[n-1];
        // for(int i=n-2;i>-1;i--)
        // {
        //     sufmax[i]=Math.max(sufmax[i+1],height[i]);
        // }
        // for(int i=0;i<n;i++)
        // {
        //     if(height[i]<premax[i]&&height[i]<sufmax[i])
        //     {
        //         res+=Math.min(premax[i],sufmax[i])-height[i];
        //     }
            
        // }
        int leftmax=0;int rightmax=0;
        int l=0;int r=n-1;
        while(l<r)
        {
            leftmax=Math.max(leftmax,height[l]);
            rightmax=Math.max(rightmax,height[r]);
            if(leftmax<rightmax)
            {
                res+=leftmax-height[l];
                l++;
            }
            else
            {
                res+=rightmax-height[r];
                r--;
            }
                        System.out.println("res:"+res);

        }

        return res;
    }
}