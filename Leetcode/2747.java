class Solution {
    
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        int m = queries.length;
        int[][] indexedQueries = new int[m][2];
        for (int i = 0; i < m; i++) {
            indexedQueries[i][0] = queries[i];
            indexedQueries[i][1] = i;
        }
        Arrays.sort(indexedQueries,(a,b)->
        {
            return a[0]-b[0];
        });
        Arrays.sort(logs,(a,b)->
        {
            if(a[1]!=b[1])
            return a[1]-b[1];
            else
            {
                return a[0]-b[0];
            }
        });
        int count=0;
        int hold[]=new int[n+1];
        int l=0;
        int r=0;
        int add[]=new int[2];
        int remo[]=new int[2];
        int res[]=new int[queries.length];
        for(int i=0;i<indexedQueries.length;i++)
        {
            int s=indexedQueries[i][0]-x;
            int e=indexedQueries[i][0];
            int og=indexedQueries[i][1];
            remo=remove(l,s,hold,logs);
            count-=remo[0];
            l=remo[1];
            add=add(r,s,e,hold,logs);
            count+=add[0];
            r=add[1];
    
            res[og]=n-count;
        }
        return res;
    }
    public static int[] remove (int l ,int s,int hold[],int[][] logs)
    {
        int ans=0;
        int res[]=new int[2];
        while(l< logs.length)
        {
            if(logs[l][1] < s)
            {
                int ser=logs[l][0];
                if(hold[ser] > 0)
                {
                    
                    hold[ser]--;
                    if(hold[ser]==0)
                    {
                        ans++;
                    }
                }
                l++;
            }
            else break;
        }
        res[0]=ans;
        res[1]=l;
        return res;
    }
    public static int[] add(int r,int s,int e,int hold[] , int[][] logs)
    {
        int ans=0;
        int res[]=new int[2];
        while(r< logs.length)
        {
            if(logs[r][1] < s)
            {
                r++;
                continue;
            }
            if(logs[r][1] <=e)
            {
                int ser=logs[r][0];
                if(hold[ser] == 0)
                {
                    ans++;
                }
                hold[ser]++;
                r++;
            }
            else break;
        }
        res[0]=ans;
        res[1]=r;
        return res;
    }
}