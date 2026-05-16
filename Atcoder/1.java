import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    int n=sc.nextInt();
    for(int i=n;i<str.length()-n;i++)
    {
        System.out.print(str.charAt(i));
    }
  }
}