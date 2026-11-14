package session10.assignment;
public class ClassAttendanceTracker {
    static int[] attendanceSummary(int[] days){
        int[] a={0,0};
        int streak=0;
        for(int i=0;i<days.length;i++){
            if(days[i]==1){
                streak++;
                a[0]++;
            }
            else{
                if(a[1]<streak)
                    a[1]=streak;
                streak=0;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int[] days = {1, 1, 0, 1, 1, 1, 0, 1};
        int[] a=attendanceSummary(days);
        System.out.println("Present: "+a[0]+", Longest Streak: "+a[1]);
        int[] day={0,0,0};
        a=attendanceSummary(day);
        System.out.println("Present: "+a[0]+", Longest Streak: "+a[1]);
    }
}
