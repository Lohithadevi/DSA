class Solution {
    public void rotate(int[][] matrix) {
        int temp[][]=new int[matrix.length][matrix[0].length];
        for(int i=0;i<temp.length;i++)
        {
            for(int j=0;j<temp[0].length;j++)
            {
                temp[i][j]=matrix[j][i];
                
            }
            
        }
        
        for(int i=0;i<temp.length;i++)
        {
            int p1=0;
            int p2=temp[0].length-1;
            while(p1<p2)
            {
                int c=temp[i][p1];
                temp[i][p1]=temp[i][p2];
                temp[i][p2]=c;
                p1++;
                p2--;
            }
        }
    for(int i=0;i<temp.length;i++)
    {
        for(int j=0;j<temp[0].length;j++)
        {
            matrix[i][j]=temp[i][j];
            
        }
        
    }
    
       
    }
}