class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n==1) return 0;
        int id=0;
        int tar=nums[n-1];
        int m;
        int mi;
        int u;
        int ur;
        int move;
        int um;
        int ui;
        int inc;
        int diff;
        int mul;
        for(int i=nums.length-2;i>=0;i--)
        {
             m=tar-nums[i];
             mi=nums[i]+m;
             u=n-i-1;
            if(u==1)
            {
                id=m;
                continue;
            }
             move=m-id;
             um=move/u;
             ui=um*(u-1);
             ur=move%u;
             inc=0;
            if(ur!=0)
            {
                inc=u-ur;
                ui+=(u-1);
            }
            tar+=ui;
       id=m;
       id+=inc;
       mi+=inc;
       if(mi!=tar)
       {
        diff=Math.abs(tar-mi);
        mul=diff*u;
        tar=mi+mul;
        id+=mul;
       }

       }
        return id;
    }
   
}