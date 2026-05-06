class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        for(int i=0;i<boxGrid.length;i++)
        {
            int len=boxGrid[0].length-1;
            int l=len;
            int c=0;
            for(int j=l;j>=0;j--)
            {
                if(boxGrid[i][j]=='#')
                {
                    c++;
                    boxGrid[i][j]='.';
                    continue;
                }
                else if(boxGrid[i][j]=='*')
                {
                    if(c>0){
                    while(c!=0)
                    {
                        boxGrid[i][len]='#';
                        len--;
                        c--;
                    }}
                    int cj=j-1;
                    while(cj>=0)
                    {
                        if(boxGrid[i][cj]!='*')
                        {
                            len=cj;
                            break;
                        }
                        cj--;
                    }
                }
            }
            if(c>0)
            {
                while(c>0)
                {
                    boxGrid[i][len]='#';
                    len--;
                    c--;
                }
            }
        }
        int m=boxGrid.length;
        int n=boxGrid[0].length;
       char res[][]=new char[n][m];
       int f=m-1;
       for(int i=0;i<m;i++)
       {
        for(int j=0;j<n;j++)
        {
            res[j][f]=boxGrid[i][j];
        }
        f--;
       }
       return res;
    }
}