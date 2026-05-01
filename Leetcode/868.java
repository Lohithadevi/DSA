class Solution {
    public int binaryGap(int n) {
        int t=n;
        int max=0;
        int c=0;
        int f=-1;
        while(t!=0)
        {
            int r=t%2;
            if(r==1)
            {
                if(f!=-1)
                {
                    int d=c-f;
                    max=Math.max(max,d);
                }
                f=c;
            }
            c++;
            t=t/2;
        }
        return max;

    }
}