class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int c=matrix[0].length;
        int pre=-1;
        for(int i=0;i<r;i++)
        {
            if(matrix[i][0]<=target && target<=matrix[i][c-1])
            {
                pre=i;
                break;
            }
        }
        if(pre==-1)
        {
            return false;
        }
        int low=0;
        int high=c-1;
        while(low<=high)
        {
            int m=(low+high)/2;
            if(matrix[pre][m]==target)
            {
                return true;
            }
            else if(matrix[pre][m]>target)
            {
                high=m-1;
            }
            else
            {
                low=m+1;
            }
        }
        return false;
    }
}