class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('b',0);
        map.put('a',0);
        map.put('l',0);
        map.put('o',0);
        map.put('n',0);

        for(int i=0;i<text.length();i++)
        {
            if(map.getOrDefault(text.charAt(i),-1)!=-1)
            {
                map.put(text.charAt(i),map.get(text.charAt(i))+1);
            }
        }
        int res=Integer.MAX_VALUE;
        for(char ch: map.keySet())
        {
            int n=map.get(ch);
            if(ch=='l' || ch=='o')
            {
                n=n/2;
            }
            res=Math.min(res,n);
        }
        return res;
    }

}