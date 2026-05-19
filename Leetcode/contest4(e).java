class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        if(s.length()==0 || s.length()==1) return false;
        for(int i=1;i<s.length();i++)
            {
                
                if(Math.abs((s.charAt(i)-'0')-(s.charAt(i-1)-'0'))>2) return false;
            }
        return true;
    }
}