class Solution {
    public static boolean fun(String str,int p1,int p2){
        while(p1<p2)
        {
            if(str.charAt(p1)!=str.charAt(p2)) return false;
            p1++;
            p2--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int p1=0;
        int p2=s.length()-1;
        while(p1<p2)
        {
            if(s.charAt(p1)!=s.charAt(p2))
            {
                return fun(s,p1+1,p2) || fun(s,p1,p2-1);
            }
            p1++;
            p2--;
        }
        return true;
    }
}