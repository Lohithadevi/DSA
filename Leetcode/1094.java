class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips,(a,b)->
        {
            if(a[1]!=b[1])
            return a[1]-b[1];
            else
            return a[2]-b[2];
        });
        int stop=0;
        for(int i=0;i<trips.length;i++)
        {
            stop=Math.max(stop,trips[i][2]);
        }
       
        int cap=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int start=trips[0][1];
       
        int idex=0;
        for(int i=0;i<trips.length;i++)
        {
            System.out.println(Arrays.toString(trips[i]));
        }
        for(int i=start;i<=stop;i++)
        {
             
            cap=cap-map.getOrDefault(i,0);
           
            while(idex<trips.length && trips[idex][1]==i)
            {
                cap=cap+trips[idex][0];
                if(cap>capacity)
                {
                    System.out.print(cap);
                    return false;
                }

                map.put(trips[idex][2],(map.getOrDefault(trips[idex][2],0)+trips[idex][0]));
                idex++;
            }

            
            
        }
      
       
        return true;
      
    }
}