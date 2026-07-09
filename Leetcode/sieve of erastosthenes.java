class Solution {
    public ArrayList<Integer> sieve(int n) {
        // code here
        
        ArrayList<Integer> li=new ArrayList<>();
        if(n<=1) return li;
        li.add(2);
        if(n==2)
        {
            
            return li;
        }
         li.add(3);
        if(n==3)
        {
           
            return li;
        }
        int arr[]=new int[n+1];
        arr[0]=-1;
        arr[1]=-1;
        for(int i=2;i*i<=n;i++)
        {
            if(arr[i]==-1) continue;
            int c=2;
            while(i*c<=n)
            {
                arr[i*c]=-1;
                c++;
            }
        }
        for(int i=4;i<=n;i++)
        {
            if(arr[i]!=-1)
            {
                li.add(i);
            }
        }
        
        return li;
    }
}