class Solution {
    public void setZeroes(int[][] m) {
         int rl=m.length;
        int cl=m[0].length;
            boolean[] row=new boolean[rl];
            boolean[] col=new boolean[cl];
            for(int i=0;i<rl;i++)
            {
                for(int j=0;j<cl;j++)
                    if(m[i][j]==0)
                    {
                        row[i]=true;
                        col[j]=true;
                    }
            }
            for(int i=0;i<rl;i++)
            {
                for(int j=0;j<cl;j++)
                 if(row[i]||col[j]) 
                       m[i][j]=0;
            
            } 
        
    }
}