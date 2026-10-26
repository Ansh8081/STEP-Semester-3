package session10.classwork;
import java.util.Scanner;
class Student{
    String name;
    int[] mark;
    Student(String name,int[] mark){
        this.name=name;
        this.mark=mark;
    }
    double average(){
        int sum=0;
        for(int m:mark)
            sum+=m;
        return (double)sum/mark.length;
    }
    String grade(){
        double a=average();
        if(a>=75)
            return "Grade B";
        else if(a>=40)
            return "Grade D";
        else
            return "Grade F";
    }
    void getinfo(){
        System.out.println(name.toUpperCase()+": Average "+String.format("%.1f",average())+", "+grade());
    }
}
public class StudentResultCardGenerator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of Students: ");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter number of Subjects: ");
        int m=sc.nextInt();
        sc.nextLine();
        Student[] s=new Student[n];
        System.out.println("Enter Student name and marks");
        for(int i=0;i<n;i++){
            int[] mark=new int[m];
            String name=sc.next();
            for(int j=0;j<m;j++){
                mark[j]=sc.nextInt();
            }
            sc.nextLine();
            s[i]=new Student(name,mark);
        }
        for(Student S:s){
            S.getinfo();
        }
        sc.close();
    }
}
