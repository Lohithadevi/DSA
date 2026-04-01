class Solution {
    public boolean wordBreak(String s, List<String> d) {
        int dp[]=new int[s.length()];
        return fun(0,s,d,dp);
    }
    public static boolean fun(int start,String s,List<String> d,int dp[])
    {
        if(start==s.length()) return true;
        if(dp[start]!=0)
        {
            return dp[start]==1;
        }
        for(String str : d)
        {
            if(s.startsWith(str,start))
            {
                if(fun(start+str.length(),s,d,dp))
                {
                    dp[start]=1;
                    return true;
                }
            }
        }
        dp[start]=2;
        return false;
    }
}



