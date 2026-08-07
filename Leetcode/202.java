class Solution {
    public boolean isHappy(int n) {
        int c=0;
        HashSet<Integer> set=new HashSet<>();
        while(!set.contains(n))
        {
            set.add(n);
            int mul=0;
            while(n!=0)
            {
                int r=n%10;
                mul+=(r*r);
                n=n/10;
            }
            if(mul==1) return true;
            n=mul;

            c++;
        }
        return false;
    }
}