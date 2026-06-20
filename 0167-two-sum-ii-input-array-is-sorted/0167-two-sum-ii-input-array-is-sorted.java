class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int res[]=new int[2];
        for(int i=0;i<numbers.length;i++)
        {
            
                res[0]=i+1;
                int l=0;
                int r=numbers.length-1;
                int remaining=target-numbers[i];
                while(l<=r)
                {
                    int m=l+(r-l)/2;
                    if(numbers[m]==remaining && i!=m)
                    {
                        res[1]=m+1;
                        return res;
                    }
                    
                        if(remaining<numbers[m] && remaining>=numbers[l])
                        {
                            r=m-1;
                        }
                        else
                        {
                            l=m+1;
                        }
                    
                    
                }
            
        }
        return res;
    }
}