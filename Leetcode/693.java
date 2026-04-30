class Solution {
    public boolean hasAlternatingBits(int n) {
       int t=n;
       int p=t%2;
       t=t/2;
       while(t>0)
       {
        int r=t%2;
        if(r==p) return false;
        p=r;
        t=t/2;
       } 
       return true;
       
    }
}