class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        if(words[startIndex].equals(target)) return 0;
        int n=words.length;
        int i=startIndex;
        int next=(i+1)%n;
        int prev=((i-1)+n)%n;
     
        while(prev!=startIndex && next!=startIndex)
        {
           
            if(words[prev].equals(target))
            {
             
                if(prev>=0 && prev<startIndex) return startIndex-prev;
                return startIndex+n-prev;



            }
            if(words[next].equals(target))
            {
               
                if(next<n && next> startIndex) return next-startIndex;
                int r=n-startIndex-1;
                return r+next+1;

            }
            next=(next+1)%n;
            prev=((prev-1)+n)%n;
        }
        return -1;
    }
}