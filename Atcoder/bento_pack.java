
import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int w=sc.nextInt();
    int arr[][]=new int[n][2];
    for(int i=0;i<n;i++)
    {
      arr[i][0]=sc.nextInt();
      arr[i][1]=sc.nextInt();
    }
    System.out.print(fun(-1,0,0,arr,w));
  }
  public static long fun(int idex , long dec , long c , int arr[][] , int w)
  {
    if(idex==arr.length-1)
    {
      if(c<=w)
      {
        return dec;
      }
      return 0;
    }
    idex++;
    long f1=fun(idex,dec+arr[idex][0],c+arr[idex][1],arr,w);
    long f2=fun(idex,dec,c,arr,w);
    return Math.max(f1,f2);
  }
}