class Solution {
    public int countBinarySubstrings(String s) {
        int zero=0;
        int one=0;
        int i=s.length()-1;
        int tot=0;
        while(i>=0)
        {
            if(s.charAt(i)=='1')
            {
                int f=0;
                while(i>=0 && s.charAt(i)=='1')
                {
                    one++;
                    i--;
                }
                if(zero==0)
                {
                    f=1;
                     while(i>=0 && s.charAt(i)=='0')
                {
                    zero++;
                    i--;
                }
                }
               
                int res=Math.min(one,zero);
                tot+=res;
                if(f==0)
                {
                    zero=0;
                }
                else
                {
                    one=0;
                }
            }
            else if(s.charAt(i)=='0')
            {
                int f=0;
                while(i>=0 && s.charAt(i)=='0')
                {
                    zero++;
                    i--;
                }
                if(one==0)
                {
                    f=1;
                     while(i>=0 && s.charAt(i)=='1')
                {
                    one++;
                    i--;
                }
                }
               
               int res=Math.min(one,zero);
                tot+=res;
                if(f==0)
                {
                    one=0;
                }
                else
                {
                    zero=0;
                }
            }
            
        }
        return tot;
    }
       
}