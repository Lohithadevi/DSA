import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long a=Long.MIN_VALUE;
    long b=Long.MIN_VALUE;
    long c=Long.MIN_VALUE;
    long temp;
    for(int i=1;i<=n;i++)
    {
      long curr=sc.nextLong();
      
      if(curr>=a)
      {
        temp=a;
        a=curr;
        curr=temp;
      }
      if(curr>=b)
      {
        temp=b;
        b=curr;
        curr=temp;
      }
      if(curr>=c)
      {
        temp=c;
        c=curr;
        curr=temp;
      }
      if(i>=3)
      {
        System.out.println(c);
      }
    }
    
  }
}