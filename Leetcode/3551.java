class Solution {
    public int minSwaps(int[] nums) {
       
        int sort[][]=new int[nums.length][3];
        for(int i=0;i<nums.length;i++)
        {
            int temp=nums[i];
            int tot=0;
            while(temp!=0)
            {
                int r=temp%10;
                tot+=r;
                temp/=10;
            }
          
            sort[i][0]=nums[i];
            sort[i][1]=tot;
            sort[i][2]=i;
        }
        Arrays.sort(sort,(a,b)->
        {
            if(a[1]!=b[1]) return a[1]-b[1];
            return a[0]-b[0];
        });
        int swap=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<sort.length;i++)
        {
            map.put(sort[i][2],i);
         
           
        }
       
        
        for(int i=0;i<sort.length;i++)
        {
            int pres=sort[i][2];
            if(map.getOrDefault(pres,-1)==-1 ) continue;
            if(map.get(pres)==pres)
            {
                map.remove(pres);
            }
            else if(map.get(map.get(pres))==pres)
            {
                swap++;
                map.remove(pres);
                map.remove(i);
            }
        }
    
        while(map.size()!=0)
        {
            ArrayList<Integer> temp=new ArrayList<>(map.keySet());
           
            int key=temp.get(0);
            while(map.size()!=0)
            {
                int val=map.get(key);
                if(map.get(val)==key)
                {
                    swap++;
                    map.remove(key);
                    map.remove(val);
                    break;
                }
                else
                {
                    swap++;
                    int v=map.get(val);
                    map.remove(key);
                    map.remove(val);
                    map.put(key,v);
                }
            }
        }
        return swap;
    }
}