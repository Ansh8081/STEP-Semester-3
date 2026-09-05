package session5.classwork;
public class HackathonSeating {
    static double rowAverage(int[] row){
        int total=0;
        for(int b:row){
            total+=b;
        }
        return (double)total/row.length;
    }
    static void classifyRows(int[][] seatingScores, int threshold){
        int i=0;
        for(int[] row:seatingScores){
            if(rowAverage(row)>threshold)
                System.out.println("Row["+i+"] Buzzing Zone");
            else
                System.out.println("Row["+i+"] Quiet Zone");
            i++;
        }
    }
    public static void main(String[] args) {
        int[][] seatingScores={{40, 50, 45},{85, 90, 95},{30, 20, 25}};
        int threshold = 60;
        classifyRows(seatingScores, threshold);
    }
}

