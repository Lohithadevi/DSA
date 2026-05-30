class Solution {
    public String largestEven(String s) {
      int f=0;
    int i=s.length()-1;
       
           
            while(i>=0 && (s.charAt(i)-'0')%2!=0)
                {
                    i--;
                }
     
        if(i<0)
        {
            return "";
        }
        return s.substring(0,i+1);
        
    }
}