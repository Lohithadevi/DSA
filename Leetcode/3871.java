class Solution {
    public long countCommas(long n) {
        if(n<1000) return 0;
        
        ArrayList<Long> l1=new ArrayList<>();
        l1.add(1000L);
        l1.add(1000000L);
        l1.add(1000000000L);
        l1.add(1000000000000L);
        l1.add(1000000000000000L);
        ArrayList<Long> l2=new ArrayList<>();
        l2.add(999999L);
        l2.add(999999999L);
        l2.add(999999999999L);
        l2.add(999999999999999L);
        l2.add(999999999999999999L);
         int comma=1;
        long ans=0;
        StringBuilder sb = new StringBuilder();
        sb.append(998999);
        long hold;
        for(int i=0;i<5;i++)
        {
            long key=l1.get(i);
            long val=l2.get(i);

           

            if(key<= n && n<=val)
            {
                long curr = n-key;
                curr++;
                ans+=curr*comma;
                
          
                break;
            }
            hold=Long.parseLong(""+sb);
            hold++;
            ans+=hold*comma;
            
            comma++;
           
            sb.append("999");
        }
        
    
        return ans;
    }
}