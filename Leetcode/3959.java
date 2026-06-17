class Solution {
    public boolean checkGoodInteger(int n) {
        int n1=0;
        int n2=0;
        while(n!=0)
        {
            int r=n%10;
            n1+=r;
            n2+=(int)Math.pow(r,2);
            n=n/10;
        }
        return n2-n1>=50;
    }
}