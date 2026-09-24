import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
	    int s=sc.nextInt();
	    long l=sc.nextLong();
	    
	   
	    int a[]=new int[n-1];
	    for(int i=0;i<n-1;i++)
	    {
	      a[i]=sc.nextInt();
	    }
	    int dist=0;
	    int left=0;
	    int right=0;
	    long curr=0;
	    long bal;
	    int i=0;
	    for(i=0;i<s;i++)
	    {
	    	long leftS=0;
	    	if(i!=0)
	    	{
	    		leftS=a[s-i-1];
	    		if((curr+leftS)>l)
	    		{
	    			break;
	    		}
	    		curr+=leftS;
	    	}
	    	bal=l-curr;
	    	int j=0;
	    	long check;
	    	long temp=0;
	    	for(j=s-1;j<a.length;j++)
	    	{
	    		temp+=a[j];
	    		check=2*Math.min(curr, temp)+Math.max(curr,temp);
	    		if(check >l)
	    		{
	    			break;
	    		}
	    	}
	    	left=i;
	    	right=j-(s-1);
	    	
	    	
	    	dist=Math.max(dist, right+left+1);
	    }
	    
	    System.out.print(dist);
		
	}
}
