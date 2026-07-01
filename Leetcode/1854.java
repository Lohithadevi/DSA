class Solution {
    public int maximumPopulation(int[][] logs) {
        int arr[]=new int[101];
        int res=0;
        int yr=0;
        for(int i=0;i<logs.length;i++)
        {
        for(int j=logs[i][0];j<logs[i][1];j++)
        {
            arr[j-1950]++;
           if(res<arr[j-1950])
           {
            yr=j;
            res=arr[j-1950];
            System.out.println(yr+" "+arr[j-1950]);
           }
           else if(res==arr[j-1950])
           {
            yr=Math.min(yr,j);
           }
           
          
        }
    
        }
       
        return yr;
    }
}