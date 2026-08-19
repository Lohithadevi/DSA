class Solution {
    public int maximumGap(String skill, String station) {
        if(skill.length()==1) return 0;
       int least[]=new int[skill.length()];
       int max[]=new int[skill.length()];
       int idx=0;
       for(int i=0;i<station.length();i++)
       {
        char ch=skill.charAt(idx);
        if(station.charAt(i)==ch)
        {
            least[idx]=i;
            idx++;
            if(idx==skill.length()) break;
        }

       }
       idx=skill.length()-1;
       for(int i=station.length()-1;i>=0;i--)
       {
    
        char ch=skill.charAt(idx);
        if(station.charAt(i)==ch )
        {
            max[idx]=i;
            idx--;
            if(idx<0) break;
        }
       }

       int res=0;

       for(int i=1;i<skill.length();i++)
       {
        
        
        res=Math.max(res,max[i]-least[i-1]);
       }
       return res;

    }
}