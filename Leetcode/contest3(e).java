class Solution {
    public boolean validDigit(int n, int x) {
        int f=0;
        int s=0;
        while(n!=0)
            {
                s=n%10;
                if(s==x)
                {
                    f=1;
                }
                
                n/=10;
            }
        return f==1 && s!=x;
    }
}