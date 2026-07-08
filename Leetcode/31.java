class Solution {
    public void nextPermutation(int[] nums) {
       ArrayList<Integer> li=new ArrayList<>();
       int i;
       int br=0;
      for(i=nums.length-1;i>0;i--)
      {
        if(nums[i]<=nums[i-1])
        {
            li.add(nums[i]);
        }
        else
        {
            li.add(nums[i]);
            i--;
            br=1;
            break;
        }
      } 
      if(br==0)
      {
        Arrays.sort(nums);
        return ;
      }
      li.add(nums[i]);
      
      int res=Integer.MAX_VALUE;
      for(int l=0;l<li.size();l++)
      {
        if(li.get(l)>nums[i] && res>li.get(l))
        {
            res=li.get(l);
            
        }
      }
      
      
      nums[i]=res;
      int idx=i+1;
      int f=0;
      Collections.sort(li);
      for(int l=0;l<li.size();l++)
      {
        
        if(li.get(l)==res && f==0) 
        {
            f=1;
            continue;
        }
        nums[idx]=li.get(l);
        idx++;

      }


    }
}