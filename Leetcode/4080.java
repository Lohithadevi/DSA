class BusBooking {

    int arr[][];
    int track=0;
    int tot=0;
    public BusBooking(int n) {
        arr=new int[n+1][4];
    }
    
    public void toggle(String seat) {
        char c=seat.charAt(0);
        int col=c-65;
        int num=Integer.parseInt(seat.substring(1,seat.length()));
        if(arr[num-1][col]==0)
        {
            tot++;
            if(col==1 || col==2)
            {
                arr[num-1][col]=1;
                track+=1;
            }
            else
            {
                if(col==0 && arr[num-1][col+1]!=0)
                {
                    arr[num-1][col]=3;
                    track+=3;
                }
                else if(col==3 && arr[num-1][col-1]!=0)
                {
                    arr[num-1][col]=3;
                    track+=3;
                }
                else
                {
                    arr[num-1][col]=1;
                    track+=1;
                }
                
            }
        }
        else
        {
            track=track-arr[num-1][col];
            arr[num-1][col]=0;
            tot--;
        }
    }
    
    public int getTotalTime() {
        return  track;
    }
    
    public int getMinTime() {
        return tot;
    }
}

/**
 * Your BusBooking object will be instantiated and called as such:
 * BusBooking obj = new BusBooking(n);
 * obj.toggle(seat);
 * int param_2 = obj.getTotalTime();
 * int param_3 = obj.getMinTime();
 */