class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> res=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            StringBuilder sb=new StringBuilder();
            int f=0;
            if(i%3==0)
            {
                f=1;
                sb.append("Fizz");
            }
            if(i%5==0)
            {
                f=1;
                sb.append("Buzz");
            }
            if(f==1)
            res.add(sb.toString());
            else
            res.add(""+i);
        }
        return res;

    }
}