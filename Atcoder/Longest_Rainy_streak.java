import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.nextLine();
    int max=Integer.MIN_VALUE;
    int track=0;
    String str=sc.nextLine();
     
    for(int i=0;i<n;i++)
    {
      char curr=str.charAt(i);
      if(curr=='S' && track!=0)
      {
        max=Math.max(max,track);
        track=0;
      }
      else if(curr=='R')
      {
        track++;
      }
    }
    max=Math.max(max,track);
    System.out.print(max);
  }
}