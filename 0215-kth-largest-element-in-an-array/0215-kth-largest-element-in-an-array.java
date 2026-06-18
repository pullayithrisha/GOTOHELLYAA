class Solution {
    public int findKthLargest(int[] nums, int k) {
        //brute force
        Arrays.sort(nums);
        for(int i:nums)
        {
            System.out.print(i+"");
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            if((nums.length-i)==k)
            {
                return nums[i];
            }
        }
        return 0;
    }
}