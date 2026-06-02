class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int left=0;
        int right=0;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++)
        {
             left=landStartTime[i]+landDuration[i];
            for(int j=0;j<waterStartTime.length;j++)
            {
                if(waterStartTime[j]<left)
                {
                    right=left+waterDuration[j];
                }
                else
                {
                    right=waterStartTime[j]+waterDuration[j];
                }
                res=Math.min(res,right);
            }
        }
        for(int i=0;i<waterStartTime.length;i++)
        {
             left=waterStartTime[i]+waterDuration[i];
            for(int j=0;j<landStartTime.length;j++)
            {
                if(landStartTime[j]<left)
                {
                    right=left+landDuration[j];
                }
                else
                {
                    right=landStartTime[j]+landDuration[j];
                }
                res=Math.min(res,right);
            }
        }
        return res;
    }
}