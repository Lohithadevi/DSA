class Solution {
    public List<Integer> matrixDiagonally(int[][] mat) {
        // code here
        List<Integer> res=new ArrayList<>();
        
        if(mat.length==0) return res;
        
        res.add(mat[0][0]);
        
        int R=mat.length;
        int C=mat[0].length;
        
        int r=0;
        int c=1;
        
        int[] val=new int[2];
        
        while(true)
        {
            val=down(r,c,R,C,res,mat);
            if(val[0]==-1) break;
            r=val[0];
            c=val[1];
            val =up(r,c,R,C,res,mat);
            r=val[0];
            c=val[1];
            if(val[0]==-1) break;
        }
        
        return res;
    }
    
    public static int[] down(int r, int c, int R,int C,List<Integer> res,int[][] mat)
    {
        int ans[]=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        while(r>=0 && r<R && c>=0 && c<C)
        {
            res.add(mat[r][c]);
            r++;
            c--;
        }
        
        r--;
        c++;
        
        int[] r1={1,0};
        int[] c1={0,1};
        
        for(int i=0;i<2;i++)
        {
            int ar=r+r1[i];
            int ac=c+c1[i];
            
            if(ar>=0 && ac>=0 && ar<R && ac<C)
            {
                ans[0]=ar;
                ans[1]=ac;
                return ans;
            
            }
        }
        
        return ans;
        
    }
    
    public static int[] up(int r, int c, int R,int C,List<Integer> res,int[][] mat)
    {
        
        int ans[]=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        while(r>=0 && r<R && c>=0 && c<C)
        {
            res.add(mat[r][c]);
            r--;
            c++;
        }
        
        r++;
        c--;
        
        int[] r1={0,1};
        int[] c1={1,0};
        
        for(int i=0;i<2;i++)
        {
            int ar=r+r1[i];
            int ac=c+c1[i];
            
            if(ar>=0 && ac>=0 && ar<R && ac<C)
            {
                ans[0]=ar;
                ans[1]=ac;
                return ans;
            
            }
        }
        
        return ans;
        
    }
    
}