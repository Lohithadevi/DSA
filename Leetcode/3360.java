class Solution {
    public boolean canAliceWin(int n) {
        int a=0;
        int b=0;
        int t=10;
        int i=0;
        while(n!=0)
        {
            if(n>=t)
            {
                if(i%2==0)
                {
                    a=1;
                    b=0;
                }
                else
                {
                    b=1;
                    a=0;
                }
            }
            else break;
            i++;
            n=n-t;
            t--;
           
        }
        return a==1;
    }
}