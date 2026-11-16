class Solution {
    public String digitSum(String s, int k) {
     
   
        while(s.length() > k)
        {
           
               int st=0;
            StringBuilder sb=new StringBuilder();
            
            while( st < s.length())
            {
                int e=st+k;
                if(e >= s.length())
                {
                    e=e-s.length();

                    e=st+k-e;
                }
               
                sb.append(""+fun(s.substring(st,e)));
                st+=k;
            }

            s=sb.toString();
            

        }
        return s;
    }
    public static int fun(String str)
    {
       int sum=0;
        for(int i=0;i<str.length();i++)
        {
            sum+=Integer.parseInt(""+str.charAt(i));
        }

        return sum;
    }
}