class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int t) {
        List<List<Integer>> res=new ArrayList<>();
     
         
        int r=grid.length;
        int c=grid[0].length;
        int need=r*c;
        need=t%need;

        
        for(int i=1;i<=need;i++)
        {
           
            int prev=grid[r-1][c-1];
            for(int j=0;j<r;j++)
            {
                for(int k=0;k<c;k++)
                {
                    int curr=grid[j][k];
                    grid[j][k]=prev;
                    prev=curr;
                }
            }

        }

        for(int i=0;i<r;i++)
        {
            List<Integer> li=new ArrayList<>();
            for(int j=0;j<c;j++)
            {
                li.add(grid[i][j]);
            }
            res.add(li);
        }
        return res;
    }
}