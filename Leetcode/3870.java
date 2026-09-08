class Solution {
    public int countCommas(int n) {
        int start=1000;
        if(n<start) return 0;
        return n-start+1;
    }
}