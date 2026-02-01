class Solution {
    public int findMin(int n) {
        // code here
        int coins[]={1,2,5,10};
        int i=3;
        int c=0;
        while(n!=0)
        {
            c+=n/coins[i];
            n=n%coins[i];
            i--;
        }
        return c;
    }
}
