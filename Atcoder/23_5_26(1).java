import java.util.*;
public class Main{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String str="HelloWorld";
    int n=sc.nextInt();
    for(int i=0;i<10;i++)
    {
      if(i+1 == n) continue;
      System.out.print(str.charAt(i));
    }
  }
}