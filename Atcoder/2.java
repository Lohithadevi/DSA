import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int res[][]=new int[r][c];
  
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            res[i][j]=check(i,j,r,c);
        }
    }
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
           System.out.print(res[i][j]+" ");
        }
        System.out.println();
    }
  }
  public static int check(int i,int j,int r,int c)
  {
      int ct=0;
      int diff[][]={{0,1},{0,-1},{1,0},{-1,0}};
      for(int k=0;k<4;k++)
      {
          int cr=i+diff[k][0];
          int cc=j+diff[k][1];
          if(cr<r && cr>=0 && cc<c && cc>=0)
          {
              ct++;
          }
      }
      return ct;
  }
}