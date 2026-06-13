class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder();
        char ch[]=new char[26];
        for(int i=25;i>=0;i--)
        {
            ch[25-i]=(char)(122-(25-i));
          
        }
       
         
           
        for(int i=0;i<words.length;i++)
        {
            int sum=0;
            for(int j=0;j<words[i].length();j++)
            {
                int c=words[i].charAt(j);
                sum+=weights[c-97];
                
            }
            sum=sum%26;

          
            sb.append(ch[sum]);
        }
        return sb.toString();
    }
}