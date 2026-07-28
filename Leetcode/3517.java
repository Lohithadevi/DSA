class Solution {
    public String smallestPalindrome(String s) {
        
        HashMap<Character,Integer> map=new HashMap<>();
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            set.add(ch);
            if(map.getOrDefault(ch,0)==0)
            {
                map.put(ch,0);
            }
            map.put(ch,map.get(ch)+1);
        }
        char arr[]=new char[s.length()];
        ArrayList<Character> li=new ArrayList<>();
        for(char ch :set)
        {
            li.add(ch);
        }
        Collections.sort(li);
        
        char f='0';
        int p1=0;
        int p2=s.length()-1;

        for(int i=0;i<li.size();i++)
        {
            char curr=li.get(i);
            int val=map.get(curr);
            if(val%2==1)
            {
                f=curr;
                map.put(curr,val-1);
                i--;
                continue;
            }
            for(int k=0;k<val/2;k++)
            {
                arr[p1]=arr[p2]=curr;
                p1++;
                p2--;
            }
        }
        if(f!='0')
        {
            arr[p1]=f;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            sb.append(arr[i]);
        }
        return sb.toString();

    }
}