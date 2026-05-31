class Solution {
    public int residuePrefixes(String s) {
        int arr[]=new int[26];
        ArrayList<Character> l=new ArrayList<>();
        int curr=0;
        int f=0;
        for(int i=0;i<s.length();i++)
            {
                char c=s.charAt(i);
                l.add(c);
                if(arr[c-97]==0)
                {
                  
                    curr++;
                    arr[c-97]=1;
                }
                if(l.size()%3==curr)
                {
                    f++;
            
                }
            }
        return f;
    }
}