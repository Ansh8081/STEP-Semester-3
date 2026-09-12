package session5.assignment;
public class TopPerformer {
    static String findMinMaxSpread(int[] scores){
        int max,min,spread;
        max=scores[0];
        min=scores[0];
        for(int j=1;j<scores.length;j++){
            if(max<scores[j])
                max=scores[j];
            if(min>scores[j])
                min=scores[j];
        }
        spread=max-min;
        return "Min: "+min+" | Max: "+max+" | Spread: "+spread;
    }
    public static void main(String[] args){
        int[] scores={45, 82, 79, 90, 33, 90, 61};
        System.out.print(findMinMaxSpread(scores));
    }
}

