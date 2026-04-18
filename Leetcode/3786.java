class Solution {
    public int mirrorDistance(int n) {
        int res=0;
        int temp=n;
        while(temp!=0)
        {
            int r=temp%10;
            res=res*10+r;

            temp=temp/10;
        }
        return Math.abs(n-res);
    }
}