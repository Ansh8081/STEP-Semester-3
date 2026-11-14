package session10.assignment;
public class ExamScoreBandCounter {
    static int countInBand(int[] scores,int low,int high){
        int a=-1,b=-1;
        for(int i=0;i<scores.length;i++){
            if(scores[i]>=low&&a==-1)
                a=i;
            if(scores[scores.length-1-i]<=high&&b==-1)
                b=scores.length-1-i;
            if(a!=-1&&b!=-1)
                break;
        }
        if(a==-1)
            return 0;

        return b-a+1;
    }
    public static void main(String[] args) {
        int[] scores = {35, 42, 42, 50, 58, 58, 58, 63, 71, 88};
        System.out.println(countInBand(scores, 42, 58));
        System.out.println(countInBand(scores, 90, 100));
    }
}
