package session7.classwork;
class Scorecard{
    static int a=0;
    private int questions;
    private boolean[] answers;
    Scorecard(int questions){
        this.questions=questions;
        answers=new boolean[questions];
    }
    void recordAnswer(boolean status){
        if(a<questions){
            answers[a]=status;
            a++;
        }
        else
            System.out.println("Number of questions exceeded");
    }
    void getScore(){
        int score=0;
        for(boolean b:answers){
            if(b==true)
                score++;
        }
        System.out.println("Total Score: "+score);
    }

}
public class TheQuizScorecard {
    public static void main(String[] args) {
        Scorecard sc = new Scorecard(4);
        sc.recordAnswer(true);
        sc.recordAnswer(true);
        sc.recordAnswer(false);
        sc.recordAnswer(true);
        sc.getScore();
    }
}
