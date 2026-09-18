class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        int temp[][]=new int[n][n];
        int col;
        int row;
        int k;
        for(int i=0;i<n;i++)
        {
            k=rowShift[i];
            for(int j=0;j<n;j++)
            {
                col=j-k+n;
                col=col%n;
                temp[i][col]=grid[i][j];
            }
        }
        int res[][]=new int[n][n];
        for(int j=0;j<n;j++)
        {
            k=colShift[j];
            for(int i=0;i<n;i++)
            {
                row=i-k+n;
                row=row%n;
                res[row][j]=temp[i][j];
            }
        }

        return res;
    }
}