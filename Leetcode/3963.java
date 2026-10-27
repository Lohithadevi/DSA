class Solution {
    public String[] createGrid(int m, int n) {
        String arr[]=new String[m];
        for(int i=0;i<m;i++)
        {
            StringBuilder sb=new StringBuilder();
        
                sb.append(".");
            
            
            for(int j=0;j<n-1;j++)
            {
                if(i==m-1)
                {
                    sb.append(".");
                    continue;
                }
                sb.append("#");
            }
            arr[i]=sb.toString();
        }
        
        return arr;
    }
}