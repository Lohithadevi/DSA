class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ch=letters[0];
        int n=target;
        int l=0;
        int r=letters.length-1;
        while(l<=r)
        {
             int m=(l+r)/2;
            if(letters[m]>n)
            {
                r=m-1;
                ch=letters[m];
            }
            else
            {
                l=m+1;
            }
        }
        
        return ch;
    }
}