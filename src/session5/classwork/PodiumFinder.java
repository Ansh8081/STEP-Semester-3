package session5.classwork;
import java.util.Arrays;
public class PodiumFinder {
    public static int[] findTopThreeScores(int[] scores){
        int[] topthree=new int[3];
        int k=0,temp;
        for(int i=0;i<scores.length;i++){
            for(int j=i+1;j<scores.length;j++){
                if(scores[i]<scores[j]){
                    temp=scores[i];
                    scores[i]=scores[j];
                    scores[j]=temp;
                }
            }
            topthree[k]=scores[i];
            k++;
            if(k==3)
                break;
        }
        return topthree;
    }
    public static void main(String[] args) {
        int[] scores={45, 82, 79, 90, 33, 90, 61};
        int[] topthree=findTopThreeScores(scores);
        System.out.print(Arrays.toString(topthree));
    }
}

