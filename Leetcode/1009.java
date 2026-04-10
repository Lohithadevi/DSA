class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        ArrayList<Integer> li=new ArrayList<>();
        while(n!=0)
        {
            li.add(n%2);
            n=n/2;
        }
        int sum=0;
        for(int i=li.size()-1;i>=0;i--)
        {
            int t=(int)Math.pow(2,i);
            int cur=li.get(i);
            if(cur==1) continue;
            sum+=t;
        }
        return sum;
    }
}