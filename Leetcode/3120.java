class Solution {
    public int numberOfSpecialChars(String word) {
    int res=0;
    int low[]=new int[26];
    int upp[]=new int[26];
    int nom[]=new int[26];
    for(int i=0;i<word.length();i++)
    {
        int curr=word.charAt(i);
        
        if(curr>=97 && curr<=122)
        {
            if(low[curr-32-65]==1 && nom[curr-32-65]!=1)
            {
                nom[curr-32-65]=1;
                res++;
            }
            upp[curr-32-65]=1;
          
        }
        else
        {
            if(upp[curr+32-97]==1 && nom[curr+32-97]!=1)
            {
                nom[curr+32-97]=1;
                res++;
            }
            low[curr+32-97]=1;
           
        }
      
    }
    return res;
    }
}