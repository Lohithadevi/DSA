class Solution {
    public String sortVowels(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u')
                {
                    int v=map.getOrDefault(s.charAt(i),0);
                    map.put(s.charAt(i),v+1);
                }
            }
        
        ArrayList<Integer> sort=new ArrayList<>();
        int hold[]=new int[s.length()];
        for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u')
                {
                    int v=map.getOrDefault(s.charAt(i),0);
                    if(v!=0)
                    {
                        hold[i]=v;
                        sort.add(hold[i]);
                        map.put(s.charAt(i),0);
                    }
                }
            }
        HashMap<Integer,ArrayList<Character>> num=new HashMap<>();
        for(int i=0;i<hold.length;i++)
            {
                if(hold[i]!=0)
                {
                    ArrayList<Character> li=new ArrayList<>();
                    if(num.getOrDefault(hold[i],null)==null)
                    {
                        li.add(s.charAt(i));
                    }
                    else
                    {
                        li=new ArrayList<>(num.get(hold[i]));
                        li.add(s.charAt(i));
                    }
                    num.put(hold[i],li);
                }
            }
        
       Collections.sort(sort,(a,b)->
                        {
                            return b-a;
                        });
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<sort.size();i++)
            {
                int n=sort.get(i);
                ArrayList<Character> li=new ArrayList<>();
                li=num.get(n);
                
                for(int j=0;j<li.size();j++)
                    {
                        char ch=li.get(j);
                        for(int k=0;k<n;k++)
                            {
                                sb.append(ch);
                            }
                    }
                num.put(n,new ArrayList<>());
            }
        StringBuilder res=new StringBuilder();
        int ind=0;
        for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u')
                {
                    res.append(sb.charAt(ind));
                    ind++;
                }
                else
                {
                    res.append(s.charAt(i));
                }
            }
        return res.toString();
        
    }
}©leetcode