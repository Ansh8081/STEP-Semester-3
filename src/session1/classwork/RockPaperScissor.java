package session1.classwork;
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissor {
    static String round(String move,String cmove){
        if(move.equalsIgnoreCase("rock")&&cmove.equals("paper"))
            return "Lose";
        else if(move.equalsIgnoreCase("paper")&&cmove.equals("scissor"))
            return "Lose";
        else if(move.equalsIgnoreCase("scissor")&&cmove.equals("rock"))
            return "Lose";
        else if(move.equals(cmove))
            return "Draw";
        else
            return "Win";
    }
    static String computermove(int random){
        if(random==0)
            return "rock";
        else if(random==1)
            return "paper";
        else
            return "scissor";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int random,win=0,lose=0,draw=0;
        System.out.print("Enter number of rounds: ");
        int round=sc.nextInt();
        sc.nextLine();
        String[] result=new String[round];
        for(int i=0;i<round;i++){
            random=r.nextInt(3);
            System.out.print("Enter Your move: ");
            String move=sc.nextLine();
            if(move.equalsIgnoreCase("rock")||move.equalsIgnoreCase("paper")||move.equalsIgnoreCase("scissor")){
                result[i]=round(move,computermove(random));
                System.out.println("Computer plays "+computermove(random));
                if(result[i].equals("Win"))
                    win++;
                else if(result[i].equals("Lose"))
                    lose++;
                else
                    draw++;
            }
            else{
                System.out.println("Enter a valid move!");
                break;
            }
        }
        if(win>lose)
            System.out.println("Player Wins");
        else if(win<lose)
            System.out.println("Computer Wins");
        else
            System.out.println("Draw");
        System.out.println("Wins: "+win+" | Loses: "+lose+" | Draws: "+draw+" | Win percent: "+(((double)win/round)*100));
        sc.close();
    }
}
