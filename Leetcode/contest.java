class Solution {
    public static void added(ArrayList<String> hold,int s,int e,String str)
    {
    if(s!=-1 && e!=-1)
    {
        hold.add(str.substring(s,e+1));
    }
    return;
    }
    public int[] countWordOccurrences(String[] chunks, String[] queries) {
        StringBuilder sb=new StringBuilder();
        ArrayList<String> hold=new ArrayList<>();
        for(int i=0;i<chunks.length;i++)
            {
                sb.append(chunks[i]);
            }
        // System.out.print(sb);
        int s=-1;
        int e=-1;
        int f=-1;
        for(int i=sb.length()-1;i>=0;i--)
            {
            char ch=sb.charAt(i);
                if(Character.isLowerCase(ch))
                {
                    if(e==-1)
                    {
                        e=i;
                    }
                    if(f!=-1)
                    {
                        f=-1;
                    }
                    s=i;
                }
                else if(ch ==' ')
                {
                    added(hold,s,e,sb.toString());
                    f=-1;
                    s=-1;
                    e=-1;
                    while(i>=0 && sb.charAt(i)==' ')
                        {
                            i--;
                        }
                    if(i==-1) break;
                    i=i+1;
                    
                }
                else if(ch=='-')
                {
                    if(f!=-1)
                    {
                        added(hold,s,e,sb.toString());
                        s=-1;
                        e=-1;
                        f=-1;
                        while(i>=0 && sb.charAt(i)=='-')
                        {
                            i--;
                        }
                    if(i==-1) break;
                    i=i+1;
                    }
                    else
                    {
                        f=1;
                    }
                }
                
            }
        added(hold,s,e,sb.toString());
        System.out.print(hold);
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<hold.size();i++)
            {
                int c=map.getOrDefault(hold.get(i),0);
                map.put(hold.get(i),c+1);
            }
        int res[]=new int[queries.length];
        for(int i=0;i<queries.length;i++)
            {
               res[i]=map.getOrDefault(queries[i],0); 
            }
        
        return res;
        
    }
}©leetcode