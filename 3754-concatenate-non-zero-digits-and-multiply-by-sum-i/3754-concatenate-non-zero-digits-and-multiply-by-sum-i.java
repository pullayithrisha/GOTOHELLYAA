class Solution {
    public long sumAndMultiply(int n) {
        String s=Integer.toString(n);
        long n1=0;
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            int d=s.charAt(i)-'0';
            sum+=d;
            if(d>0)
            {
                n1=n1*10+d;
            }
        }
        System.out.println("s:"+sum);
        System.out.println("n1:"+n1);
        return sum*n1;
    }
}