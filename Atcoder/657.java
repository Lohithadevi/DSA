class Solution {
    public boolean judgeCircle(String moves) {
     int s1=0;
     int s2=0;
     for(char ch : moves.toCharArray())
     {
        if(ch=='U')
        {
            s1++;
        }
        else if(ch=='D')
        {
            s1--;
        }
        else if(ch=='L')
        {
            s2++;
        }
        else
        {
            s2--;
        }
    
     }
     return s1==0 && s2==0;   
    }
    
}