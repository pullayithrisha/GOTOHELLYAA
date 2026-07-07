class Solution {
    public long f(String s,int[] a)
    {
        int start=a[0];
        int end=a[1];
        long sum=0;
        long n=0;
        long MOD = 1_000_000_007;
        for(int i=start;i<=end;i++)
        {
            int d=s.charAt(i)-'0';
            sum+=d;
            if(d>0)
            {
                n=(n*10+d)%MOD;
            }
        }
        return (sum*n)%MOD;
    }
    public int[] sumAndMultiply(String s, int[][] queries) {
        int[] res=new int[queries.length];
        int n=s.length();
        long MOD = 1_000_000_007;
        // for(int i=0;i<queries.length;i++)
        // {
        //     res[i]= (int)f(s,queries[i]);
        // }
        long[] prefixsum=new long[n];
        long[] count=new long[n];
        long[] numbernonzero=new long[n];
        for(int i=0;i<n;i++)
        {
            int d=s.charAt(i)-'0';
            if(i>0)
            {
                prefixsum[i]=prefixsum[i-1];
                count[i]=count[i-1];
                numbernonzero[i]=numbernonzero[i-1];
            }
            if(d!=0)
            {
                prefixsum[i]+=d;
                count[i]++;
                numbernonzero[i]=(((numbernonzero[i]*10)%MOD)+d)%MOD;
            }
        }
        long power[]=new long[n+1];
        power[0]=1;
        for(int i=1;i<=n;i++)
        {
            power[i]=(power[i-1]*10)%MOD;
        }

        for(int i=0;i<queries.length;i++)
        {
        //System.out.println("count:"+count[i]+" prefixsum:"+prefixsum[i]+"nonzero:"+numbernonzero[i]);
            int l=queries[i][0];
            int r=queries[i][1];
            long len=count[r]-((l>0)?count[l-1]:0);
            long x=numbernonzero[r];
            if(l>0){
                x=(x-(numbernonzero[l-1]*power[(int)len]%MOD)+MOD)%MOD;
            }
            long sum=prefixsum[r]-(l>0?prefixsum[l-1]:0)%MOD;
            res[i]=(int)((sum*x)%MOD);
        }
        return res;
    }
}