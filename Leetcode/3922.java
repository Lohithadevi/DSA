class Solution {
    public int minFlips(String s) {
        int o=0;
        int z=0;
        for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='1')
                {
                    z++;
                }
                else
                {
                    o++;
                }
            }
        int min=Math.min(o,z);
        min=z>1?Math.min(min,z-1):0;
        int r=0;
        for(int i=1;i<s.length()-1;i++)
            {
                if(s.charAt(i)=='1')
                {
                    r++;
                }
            }
        if(s.charAt(0)=='0')
        {
            r++;
        }
        if(s.charAt(s.length()-1)=='0')
        {
            r++;
        }
        return Math.min(min,r);
        
    }
}©leetcode