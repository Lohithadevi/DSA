class Solution {
    
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String> res=new ArrayList<>();
        HashMap<Integer,Character> map=new HashMap<>();
        map.put(0,'R');
        map.put(1,'L');
        map.put(2,'D');
        map.put(3,'U');
        int[][] visit=new int[maze.length][maze[0].length];
                    StringBuilder sb=new StringBuilder();
                    visit[0][0]=1;
                    fun(0,0,res,maze,sb,visit,map);
                    Collections.sort(res);
         return res;
    }
    public static void fun(int r,int c, ArrayList<String> res,int[][] mat,StringBuilder sb,int[][] visit,HashMap<Integer,Character> map)
    {
        if(r==mat.length-1 && c==mat[0].length-1)
        {
            res.add(sb.toString());
            return;
        }
        int[][] diff={{0,1},{0,-1},{1,0},{-1,0}};
        
        for(int i=0;i<4;i++)
        {
            int cr=r+diff[i][0];
            int cc=c+diff[i][1];
            
            if(cr>=0 && cr<mat.length && cc>=0 && cc<mat[0].length)
            {
                if(mat[cr][cc]==0) continue;
                if(visit[cr][cc]==1) continue;
                visit[cr][cc]=1;
                sb.append(map.get(i));
                fun(cr,cc,res,mat,sb,visit,map);
                sb.setLength(sb.length()-1);
                visit[cr][cc]=0;
            }
        }
        
    }
    
}