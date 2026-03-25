class Solution {
    public static void fun(int s, String str,List<String> p,List<List<String>> res)
    {
        if(s==str.length())
        {
            res.add(new ArrayList<>(p));
            return;
        }
        for(int i=s;i<str.length();i++)
        {
            if(check(s,i,str))
            {
                p.add(str.substring(s,i+1));
                fun(i+1,str,p,res);
                p.remove(p.size()-1);
            }
        }
        return;
    }

    public List<List<String>> partition(String s) {
        List<String> p = new ArrayList<>();
        List<List<String>> res=new ArrayList<>();
        fun(0,s,p,res);
        return res;
    }
    public static boolean check(int s, int e, String str)
    {
        while(s<e)
        {
            if(str.charAt(s)!=str.charAt(e)) return false;
            s++;
            e--;
        }
        return true;
    }
}