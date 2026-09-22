import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int hold[]=new int[3];
    int need=0;
    int mul=0;
    int ans=0;
    int i;
    for(int id=0;id<n;id++)
    {
      int curr=sc.nextInt();
      need=curr/1000;
      if(need==0)
      {
        need=1;
      }
      else
      {
    	  
    	  if(curr%1000!=0)
          {
            need++;
          }
      }
      
      mul=need*1000;
      ans=mul-curr;
      i=2;
      while(ans!=0)
      {
        int rem=ans%10;
        //System.out.println(i+" "+ans);
            hold[i]+=rem;
            
        i--;
        ans=ans/10;
      }
      
    }
    System.out.print(hold[2]+" "+hold[1]+" "+hold[0]);
  }
}