class Solution {
     static int count=1;
    public List<List<String>> solveNQueens(int n) {
      char mat[][]=new char[n][n];
       List<List<String>> res =new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]='.';
            }
        }
        int help[]=new int[n];
        List<String> li=new ArrayList<>();
        fun(0,mat,n,help,li,res);
        return res;
        
    }
     public static int fun(int idx,char[][] mat,int n,int[] help,List<String> li,List<List<String>> res)
    {
        if(idx==n)
        {
            return 1;
        }
        for(int i=0;i<n;i++)
        {
            if(help[i]==1) continue;
            if(!vaild(idx,i,mat)) continue;
        
            help[i]=1;
             mat[idx][i]='Q';
            int temp=fun(idx+1,mat,n,help,li,res);
            if(temp==1)
            {
                li=new ArrayList<>();
                add(mat,li,res);
            }
            mat[idx][i]='.';
            help[i]=0;
        }
    
    return 0;
}
public static void add(char[][] mat,List<String> li , List<List<String>> res)
{
    System.out.print(count);
    for(int i=0;i<mat.length;i++)
    {
      
        StringBuilder sb=new StringBuilder();
        for(int j=0;j<mat[0].length;j++)
        {
            sb.append(mat[i][j]);
        }
        li.add(sb.toString());
    
    }
    count++;
    res.add(new ArrayList<>(li));
    
}
public static boolean vaild(int r,int c,char[][] mat)
{
    int tr=r-1;
    int cl=c-1;
    int cr=c+1;
    while(tr>=0)
    {
        if(cl>=0)
        {
            if(!(mat[tr][cl]=='.')) return false;
            cl--;
        }
        if(cr<mat[0].length)
        {
            if(!(mat[tr][cr]=='.')) return false;
            cr++;
        }
        tr--;
    }
    return true;
}
}
