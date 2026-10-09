import java.util.*;

public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int max=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
    	arr[i]=sc.nextInt();
    }
    long res=0;
    for(int i=0;i<n-2;i++)
    {
      for(int j=i+1;j<n-1;j++)
      {
        for(int k=j+1;k<n;k++)
        {
          int sum=i+j+k+3;
          if(sum<=max)
          {
            long curr=arr[i]+arr[j]+arr[k];
            res=Math.max(res,curr);
          }
          else
          {
          
            break;
          }
        }
      }
    }
    System.out.print(res);
  }
}