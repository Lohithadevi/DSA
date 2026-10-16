import java.util.*;
public class Main
{
  public static void main(string[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n =sc.nextInt();
    int tot=0;
    for(int i=1;i<=n;i++)
    {
      int curr=sc.nextInt();
      if(i%2==1)
      {
        tot+=curr;
      }
    }
    System.out.println(tot);
  }
}