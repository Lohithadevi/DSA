class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        int p1=Integer.parseInt(arriveAlice.substring(0,2));
        int p2=Integer.parseInt(arriveAlice.substring(3,5));
        int p3=Integer.parseInt(leaveAlice.substring(0,2));
        int p4=Integer.parseInt(leaveAlice.substring(3,5));

        int p5=Integer.parseInt(arriveBob.substring(0,2));
        int p6=Integer.parseInt(arriveBob.substring(3,5));
        int p7=Integer.parseInt(leaveBob.substring(0,2));
        int p8=Integer.parseInt(leaveBob.substring(3,5));

        int startm=0;
        int startd=0;
        int endm=0;
        int endd=0;

        if(p1==p5)
        {
            startm=p1;
            startd= p2 >= p6 ? p2 : p6;
        }
        else
        {
            if(p1 > p5)
            {
                startm=p1;
                startd=p2;
            }
            else
            {
                startm=p5;
                startd=p6;
            }
        }
        if(p3==p7)
        {
            endm=p3;
            endd=p4 <= p8 ? p4 : p8;
        }
        else
        {
            if(p3 < p7)
            {
                endm=p3;
                endd=p4;
            }
            else
            {
                endm=p7;
                endd=p8;
            }
        }
       
          if(endm < startm || endm==startm && endd < startd) return 0;
        return (fun(endm,endd)-fun(startm,startd) )+ 1;
        
    }
    public static int fun(int m , int d)
    {
        int arr[]={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int tot=0;
        for(int i=0;i<m-1;i++)
        {
            tot+=arr[i];
        }
        return tot+d;
    }
}