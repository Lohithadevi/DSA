class Solution {
    public int maxEqualAdjacentPairs(int[] nums) {
        HashMap<Integer,ArrayList<ArrayList<Integer>>> map=new HashMap<>();
        HashMap<Integer,Integer> freq=new HashMap<>();
        int ans=0;
        int f=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++)
        {
            int change = nums[i+1];
            int too=nums[i];
            if(change==too)
            {
                freq.put(change,freq.getOrDefault(change,0)+1);
                continue;
            }
            int count1=fun(map,change,too);
            int count2=fun(map,too,change);
            if(max<count1)
            {
                ans=count1;
                 max=ans;
                
            }
            if(max<count2)
            {
                ans=count2;
                 max=ans;
             
            }
            
           
        }
        for(int i : freq.keySet())
            {
                f+=freq.get(i);
            }
    
        return ans+f;
    }
    public static int fun(HashMap<Integer,ArrayList<ArrayList<Integer>>> map , int change , int too)
    {
        int ans=0;
        ArrayList<ArrayList<Integer>> select=new ArrayList<>();
        if(map.getOrDefault(change,null)!=null)
        {
            select=new ArrayList<>(map.get(change));
           
        }
        int l=0;
        int r=select.size()-1;
        int m=0;
        int f=0;
        while(l<=r)
        {
            m=(l+r)/2;
            
            int to=select.get(m).get(0);
       
            if(to==too)
            {
                r=m;
                f=1;
                break;
            }
            else if(to<too)
            {
                l=m+1;
            }
            else
            {
                r=m-1;
            }
        }
        if(f==1)
        {
            ArrayList<Integer> remove=new ArrayList<>(select.get(r));
            select.remove(r);
            remove.set(1,remove.get(1)+1);
            
            if((select.size()==0) || r==select.size())
            {
                select.add(remove);
                
            }
            else
            {
                select.add(r,remove);
            }
            
            ans=remove.get(1);
        }
        else
        {
            ArrayList<Integer> newer = new ArrayList<>();
            newer.add(too);
            newer.add(1);
            ans=1;
        
            if(select.size()==0 || r+1 == select.size())
            {
                select.add(newer);
               
               
            }
            else
            {
                 select.add(r+1,newer);
               
            }
            
        }
        map.put(change,select);
        return ans;
    }
}