class Solution {
    int[][] rotateMatrix(int k, int mat[][]) {
        // code here
        int res[][]=new int[mat.length][mat[0].length];
        int rot=k%mat[0].length;
        for(int i=0;i<mat.length;i++)
        {
            int idx=mat[0].length-1;
            int ele=rot-1;
            for(int j=1;j<=rot;j++)
            {
                res[i][idx]=mat[i][ele];
                idx--;
                ele--;
            }
            idx=0;
            for(int j=rot;j<mat[0].length;j++)
            {
                res[i][idx]=mat[i][j];
                idx++;
            }
        }
        return res;
    }
}