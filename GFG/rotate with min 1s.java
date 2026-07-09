class Solution {
    int minRow(int mat[][]) {
        // code here
        int max=Integer.MAX_VALUE;
        int res=0;
        for(int i=0;i<mat.length;i++)
        {
            int one=0;
            for(int j=0;j<mat[0].length;j++)
            {
                one=mat[i][j]==1?one+1:one;
            }
            if(max>one)
            {
                res=i+1;
                max=one;
            }
        }
        return res;
    }
}