class Solution {
    public long sumAndMultiply(int n) {
        long res=0;
        String s=Integer.toString(n);
        String n1="";
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='0')
            {
                n1+=s.charAt(i);
                sum+= s.charAt(i)-'0';
            }
        }
        if(n1==""){return 0;}
        long n2=Long.parseLong(n1);
        System.out.println("s:"+sum);
        System.out.println("n1:"+n1);

        return sum*n2;
    }
}