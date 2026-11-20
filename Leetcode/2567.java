class Solution {
    public int minimizeSum(int[] nums) {
    int ans=Integer.MAX_VALUE;
    Arrays.sort(nums);
    int a= nums[nums.length-1]-nums[0];
    int b=Integer.MAX_VALUE;
    for(int i=1;i<nums.length;i++)
    {
        b=Math.min(b,nums[i]-nums[i-1]);
    }
    ans=Math.min(ans,b+a);
 
    int p1=0;
    int temp=-1;
    while(p1 < nums.length)
    {
        if(nums[0]==nums[p1])
        {
            p1++;
        }
        else
        {
            temp=nums[p1];
            break;
        }
    }

    if(p1==1)
    {
        a=0;
        int t1=nums[nums.length-1]-temp;
        int t2=nums[nums.length-2]-temp;
        b=Math.min(t1,t2);
        ans=Math.min(ans,b+a);
      
    }
    if(p1==1)
    {
        int p=p1;
        int t=-1;
        while(p < nums.length)
        {
            if(nums[p]==temp)
            {
                p++;
            }
            else
            {
                t=nums[p];
                break;
            }
        }
        if(p-p1 == 1)
        {
            a=0;
            b=nums[nums.length-1]-t;
            ans=Math.min(ans,a+b);
         
        }
    }
    if(p1==2)
    {
        a=0;
        b=nums[nums.length-1]-temp;
        ans=Math.min(ans,a+b);
     
    }
        int p2=nums.length-1;
        while(p2 >= 0)
        {
            if(nums[p2]==nums[nums.length-1])
            {
                p2--;
            }
            else
            {
                temp=nums[p2];
                break;
            }
        }
        if(nums.length-1-p2 ==1)
        {
            a=0;
            int t1=nums[0];
            int t2=nums[1];
            b=Math.max(t1,t2);
            b=temp-b;
            ans=Math.min(ans,a+b);
           
        }
        if(nums.length-1-p2 ==1)
        {
            int b1=p2;
            int t=0;
            while(b1 >= 0)
            {
                if(nums[b1]==temp)
                {
                    b1--;
                }
                else
                {
                    t=nums[b1];
                    break;
                }
            }
            if(nums.length-1-b1 ==2)
            {
                a=0;
                b=t-nums[0];
                ans=Math.min(ans,a+b);
                
            }
        }
        if(nums.length-1-p2 ==2)
        {
            a=0;
            b=temp-nums[0];
            ans=Math.min(ans,a+b);
            
        }
        return ans;
        
    }
}