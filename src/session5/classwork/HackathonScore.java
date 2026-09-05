package session5.classwork;
import java.util.Arrays;
public class HackathonScore{
    public static void curveScores(int[] scores,int i){
        for(int j=0;j<scores.length;j++){
            scores[j]=scores[j]+i;
        }
    }
    public static void main(String[] args) {
        int[] scores={70,85,60};
        curveScores(scores, 10);
        System.out.println(Arrays.toString(scores));
    }
}
