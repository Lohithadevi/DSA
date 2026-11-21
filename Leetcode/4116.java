class Solution {
    public String[] assignUmbrella(int[] rain) {
        int n=rain.length;
        String ans[]=new String[n];
        int p1=0;
        int p2=0;
        for(int i=0;i<n-1;i++)
        {
            int curr=rain[i];
            if(curr==0)
            {
                ans[i]="None";
            }
            else
            {
                if(rain[i+1]==1)
                {
                    if(p1<=p2)
                    {
                        ans[i]="Alice";
                        p1++;
                    }
                    else
                    {
                        ans[i]="Bob";
                        p2++;
                    }
                }
                else
                {
                    ans[i]="Bob";
                    p2++;
                }
            }
        }
        if(rain[n-1]==1)
        {
            ans[n-1]="Bob";
        }
        else
        {
            ans[n-1]="None";
        }
        return ans;
    }
}