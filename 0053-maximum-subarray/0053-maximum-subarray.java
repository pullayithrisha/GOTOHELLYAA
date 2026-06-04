class Solution {
    public int maxSubArray(int[] nums) {
        int res=Integer.MIN_VALUE;
        int s=0;
        int start=0;
        int stindx=-1;int endidx=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(s==0)
            {
                start=i;
            }
            s+=nums[i];
            if(s>res)
            {
                res=s;
                stindx=start;
                endidx=i;
            }
            if(s<0)
            {
                s=0;

            }
        }
        for(int i=stindx;i<=endidx;i++)
        {
            System.out.println(nums[i]+"");
        }
        return res;
    }
}