class Solution {
    public String trimTrailingVowels(String s) {
        int e=s.length();
        while(e>0)
            {
                char c=s.charAt(e-1);
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                {
                    e--;
                }
                else
                {
                    break;
                }
            }
        return e<=0 ? "" : s.substring(0,e);
    }
}