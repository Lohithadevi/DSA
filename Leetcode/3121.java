class Solution {
    public int numberOfSpecialChars(String word) {
        int low[]=new int[26];
        int upp[]=new int[26];
        int hold[]=new int[26];
        for(int i=0;i<word.length();i++)
        {
            int ch=(int)word.charAt(i);
           
            if(ch>=65 && ch<=90)
            {
                if(upp[ch-65]==0)
                {
                    upp[ch-65]=i+1;
                }
            }
            else
            {
                low[ch-97]=i+1;
            }
        }
        int res=0;
        for(int i=0;i<word.length();i++)
        {
            int ch=(int)word.charAt(i);
            if(ch>=97 && ch<=122)
            {
                int last=low[ch-97]-1;
              
                if(upp[ch-32-65]>last && hold[ch-97]==0)
                {
                    hold[ch-97]=1;
                    res++;
                }
            }
        }
        return res;
    }
}