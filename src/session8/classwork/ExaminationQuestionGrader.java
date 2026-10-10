package session8.classwork;
import java.util.Scanner;
abstract class Question{
    protected double point;
    protected double markOobtained;
    protected String studentanswer;
    protected String correctanswer;
    static protected double total=0;
    Question(String correctanswer,String studentanswer,double point){
        this.point=point;
        this.studentanswer=studentanswer;
        this.correctanswer=correctanswer;
    }
    abstract void display();
    static void displaytotal(){
        System.out.println("Total: "+total);
    }
}
class Mcq extends Question{
    Mcq(String correctanswer,String studentanswer,double point){
        super(correctanswer,studentanswer, point);
        if(correctanswer.equalsIgnoreCase(studentanswer))
            markOobtained=point;
        else
            markOobtained=0;
        total+=markOobtained;
    }
    void display(){
        System.out.println("MCQ: "+markOobtained);
    }
}
class TF extends Question{
    TF(String correctanswer,String studentanswer,double point){
        super(correctanswer,studentanswer, point);
        if(correctanswer.equalsIgnoreCase(studentanswer))
            markOobtained=point;
        else
            markOobtained=0;
        total+=markOobtained;
    }
    void display(){
        System.out.println("TF: "+markOobtained);
    }
}
class Essay extends Question{
    Essay(String correctanswer,String studentanswer,double point){
        super(correctanswer,studentanswer, point);
        String[] a=correctanswer.split(", ");
        int i=0;
        for(int j=0;j<a.length;j++){
            if(studentanswer.toLowerCase().contains(a[j].toLowerCase())){
                i++;
            }
        }
        if(i==2)
            markOobtained=0.75*point;
        else if(i==1)
            markOobtained=0.5*point;
        else
            markOobtained=0;
        total+=markOobtained;
    }
    void display(){
        System.out.println("Essay: "+markOobtained);
    }
}

public class ExaminationQuestionGrader {
    static Question questionType(String questionstatement){
        String type=questionstatement.substring(0,questionstatement.indexOf(" ")).toLowerCase();
        String[] a=questionstatement.split("\" ");
        String correctanswer=a[a.length-3].substring(1);
        String studentanswer=a[a.length-2].substring(1);
        double point=Double.parseDouble(a[a.length-1]);
        switch(type){
            case "mcq":
                return new Mcq(correctanswer, studentanswer, point);
            case "essay":
                return new Essay(correctanswer, studentanswer, point);
            default:
                return new TF(correctanswer, studentanswer, point);
        }


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Question[] q=new Question[n];
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            q[i]=questionType(s);
        }
        for(Question Q:q){
            Q.display();
        }
        Question.displaytotal();
        sc.close();
    }
}

