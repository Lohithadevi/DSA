class Solution {
    public void fun(int n,StringBuilder sb,ArrayList<String> res)
    {
        if(sb.length()==n)
        {
            res.add(""+sb);
            return;
        }
        StringBuilder zero=new StringBuilder(sb);
        fun(n,zero.append(0),res);
        StringBuilder one=new StringBuilder(sb);
        fun(n,one.append(1),res);
        return;
        
    }
    public ArrayList<String> binstr(int n) {
        // code here
        ArrayList<String> res=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        fun(n,sb,res);
        return res;
    }
}
