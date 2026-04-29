class Solution {
    public int numSpecial(int[][] mat) {
        int col[]=new int[mat[0].length];
        int row[]=new int[mat.length];
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<col.length;j++)
            {
                if(mat[i][j]==1)
                {
                    row[i]++;
                    col[j]++;
                }
            }
        }
        int r=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<col.length;j++)
            {
                if(mat[i][j]==1 && row[i]==1 && col[j]==1)
                {
                    r++;
                }
            }
        }
        return r;
    }
}