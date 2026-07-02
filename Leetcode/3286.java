class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        Queue<List<Integer>> st=new LinkedList<>();
        List<Integer> li=new ArrayList<>();
        int R=grid.size();
        int C=grid.get(0).size();
        li.add(0);
        li.add(0);
        
        int initialDamage = (grid.get(0).get(0) == 1) ? 1 : 0;
        li.add(initialDamage);
        st.offer(li);
        int r[]={0,0,-1,1};
        int c[]={1,-1,0,0};
        
        int[][] minDamage = new int[R][C];

        for (int i = 0; i < R; i++) {
            Arrays.fill(minDamage[i], Integer.MAX_VALUE);
        }
        minDamage[0][0] = initialDamage;
        while(!st.isEmpty())
        {
            List<Integer> temp=st.poll();
            int cr=temp.get(0);
            int cc=temp.get(1);
            int one=temp.get(2);
            if(cr==R-1 && cc==C-1)
            {
                if(one<health) return true;
            }
            if(one>=health) continue;
            for(int i=0;i<4;i++)
            {
                int o=one;
                int ar=cr+r[i];
                int ac=cc+c[i];
                if(ar<R && ac<C && ar>=0 && ac>=0)
                {
                    if(grid.get(ar).get(ac)==1)
                    {
                        o++;
                    }
                    if(o>=health) continue;
                   if (o < minDamage[ar][ac]) {
                        minDamage[ar][ac] = o;
                        
                        List<Integer> hold = new ArrayList<>();
                        hold.add(ar);
                        hold.add(ac);
                        hold.add(o);
                        st.offer(hold);
                 
                      }   }
            }
        }
        return false;
    }
}