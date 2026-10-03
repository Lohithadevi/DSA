import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    char ch=sc.nextLine().charAt(0);
    char ans;
    if(ch=='B')
    {
      ans='Y';
    }
    else if(ch=='Y')
    {
      ans='R';
    }
    else
    {
      ans='B';
    }
    System.out.print(ans);
    
  }
}