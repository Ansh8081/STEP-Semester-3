package session10.assignment;
public class SecondBestScore {
    static int secondHighest(int[] scores){
        int seconlargest=0,largest=0;
        for(int i=0;i<scores.length;i++){
            if(largest<scores[i])
                largest=scores[i];
            if(largest>seconlargest&&seconlargest<scores[i]&&largest!=scores[i])
                seconlargest=scores[i];
        }
        if(seconlargest!=0)
            return seconlargest;
        return -1;
    }
    public static void main(String[] args){
        int[] scores = {45, 78, 92, 78, 60};
        System.out.println(secondHighest(scores));
        int[] score = {50, 50, 50};
        System.out.println(secondHighest(score));
    }
}
