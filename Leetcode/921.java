class Solution {
    public int minAddToMakeValid(String s) {
        int track=0;
        int res=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==')')
            {
                if(track==0)
                {
                    res++;
                }
                else
                {
                    track--;
                }
            }
            else
            {
                track++;
            }
        }
        return track+res;
    }
}