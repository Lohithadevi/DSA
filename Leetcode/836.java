class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int a=Math.min(rec1[0],rec1[2]);
        int b=Math.max(rec1[0],rec1[2]);
        int c=Math.min(rec1[1],rec1[3]);
        int d=Math.max(rec1[1],rec1[3]);
        if(rec2[0]>=b && rec2[2]>=b) return false;
        if(rec2[0]<=a && rec2[2]<=a) return false;
        if(rec2[1]>=d && rec2[3]>=d) return false;
        if(rec2[1]<=c && rec2[3]<=c) return false;
        return true;
    }
}