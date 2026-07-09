class Solution {
    public void rotateMatrix(int[][] mat) {
        // code here
        int n=mat.length;
        int s=0;
        int e=n-1;
        while(s<e)
        {
            int t=e-s;
            for(int i=0;i<t;i++)
            {
                int fir=mat[s][e-i];
                int sec=mat[s+i][s];
                int thi=mat[e][s+i];
                int fou=mat[e-i][e];
                mat[s][e-i]=fou;
                mat[s+i][s]=fir;
                mat[e][s+i]=sec;
                mat[e-i][e]=thi;
            }
            s++;
            e--;
        }
    }
}