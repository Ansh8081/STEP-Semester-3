package session5.assignment;
public class MatchGrindAnalyzer{
    static double rowAverage(int[] row){
        double sum = 0;
        for(int run : row)
            sum+=run;
        return sum/row.length;
    }
    static String classifyMatches(int[][] runsPerOver, int threshold){
        String s="";
        int i=0;
        StringBuilder sb=new StringBuilder(s);
        for(int[] run : runsPerOver){
            if(rowAverage(run)>threshold)
                sb.append("Match "+i+": Power Surge");
            else
                sb.append("Match "+i+": Normal");
            if(i<(runsPerOver.length-1))
                sb.append(" | ");
            i++;
        }
        s=sb.toString();
        return s;
    }
    public static void main(String[] args){
        int[][] runsPerOver={{4, 6, 8},{10, 12, 14},{2, 3, 1}};
        int threshold = 8;
        System.out.print(classifyMatches(runsPerOver, threshold));
    }
}
