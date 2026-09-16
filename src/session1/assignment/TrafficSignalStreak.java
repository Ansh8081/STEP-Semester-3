package session1.assignment;
public class TrafficSignalStreak {
    static void findLongestStreak(String signalLog){
        int r=1,y=1,g=1;
        int maxr=1,maxy=1,maxg=1;
        for(int i=1;i<signalLog.length();i++){
            if(signalLog.charAt(i-1)==signalLog.charAt(i)&&signalLog.charAt(i)=='R')
                r++;
            else
                r=1;
            if(r>maxr)
                maxr=r;
            if(signalLog.charAt(i-1)==signalLog.charAt(i)&&signalLog.charAt(i)=='Y')
                y++;
            else
                y=1;
            if(y>maxy)
                maxy=y;
            if(signalLog.charAt(i-1)==signalLog.charAt(i)&&signalLog.charAt(i)=='G')
                g++;
            else
                g=1;
            if(g>maxg)
                maxg=g;
        }
        if(maxr>maxy&&maxr>maxg)
            System.out.println("Longest Streak: 'R' repeated "+maxr+" times");
        else if(maxg>maxy&&maxg>maxr)
            System.out.println("Longest Streak: 'G' repeated "+maxg+" times");
        else
            System.out.println("Longest Streak: 'Y' repeated "+maxy+" times");
    }
    public static void main(String[] args){
        String signalLog="RRRRYYGG";
        findLongestStreak(signalLog);
    }
}
