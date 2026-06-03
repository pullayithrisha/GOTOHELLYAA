class Solution {
    public void sortColors(int[] nums) {
        int o=0;
        int t=0;
        int z=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                z++;
            }
            else if(nums[i]==1)
            {
                o++;
            }
            else{t++;}
        }
        int i=0;
        while(i<z)
        {
            nums[i]=0;
            i++;
        }
        while(i<nums.length-t)
        {
            nums[i]=1;
            i++;
        }
        while(i<nums.length)
        {
            nums[i]=2;
            i++;
        }
    }
}