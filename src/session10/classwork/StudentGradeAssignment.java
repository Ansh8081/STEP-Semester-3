package session10.classwork;
import java.util.Scanner;
public class StudentGradeAssignment {
    static int entermark(Scanner sc){
        int n=sc.nextInt();
        sc.nextLine();
        if(n<0||n>100){
            System.out.println("Invalid marks!");
            return entermark(sc);
        }
        else
            return n;
    }
    static String grader(int mark){
        if(mark>=90)
            return "Grade A";
        else if(mark>=75)
            return "Grade B";
        else if(mark>=60)
            return "Grade C";
        else if(mark>=40)
            return "Grade D";
        else
            return "Grade F";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        sc.nextLine();
        int[] a=new int[n];
        System.out.println("Enter marks");
        for(int i=0;i<n;i++){
            a[i]=entermark(sc);
        }
        System.out.println("Grades");
        for(int A:a){
            System.out.println(grader(A));
        }
        sc.close();
    }
}
