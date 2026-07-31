class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int r=0;
        int c=0;
        int R=mat.length;
        int C=mat[0].length;

        int res[]=new int[2];
        res[0]=-1;
        res[1]=-1;

        int r1[]={0,0,1,-1};
        int c1[]={1,-1,0,0};
        while(r<R && c<C && r>=0 & c>=0)
        {
            int tr=0;
            int tc=0;
            int ar=0;
            int ac=0;

            int max=Integer.MIN_VALUE;
            for(int i=0;i<4;i++)
            {
                tr=r+r1[i];
                tc=c+c1[i];
                if(tr<R && tr>=0 && tc<C && tc>=0)
                {
                    if(max<mat[tr][tc])
                    {
                        ar=tr;
                        ac=tc;
                        max=mat[tr][tc];
                    }
                }
            }
            if(mat[ar][ac]<mat[r][c])
            {
               res[0]=r;
               res[1]=c;
               return res;
            }
            r=ar;
            c=ac;
        }
        return res;
    }
}