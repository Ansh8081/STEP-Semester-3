package session12.classwork;
import java.util.Scanner;
class Student{
    private String name;
    private char grade;
    private double average;
    private double total;
    private boolean status=true;
    static int fault=0;
    Student(String name,int m1,int m2,int m3){
        this.name=name;
        total=(m1+m2+m3);
        average=(double)(m1+m2+m3)/3;
        if(average>=80){grade='A';}
        else if(average>=70){grade='B';}
        else if(average>=60){grade='C';}
        else if(average>=40){grade='D';}
        else{grade='F';}
        if(m1>100||m2>100||m3>100){
            status=false;
            total=301+fault;
            fault++;
        }
    }
    void studentinfo(){
        if(status)
            System.out.println(name+" total="+total+" avg="+average+" grade="+grade);
        else
            System.out.println(name+" skipped: marks must be 0 to 100");
    }
    double gettotal(){return total;}
    boolean getstatus(){return status;}
}
public class ClassReportCard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Student[] students=new Student[n];
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            String[] a=s.split(" ");
            students[i]=new Student(a[0],Integer.parseInt(a[1]),Integer.parseInt(a[2]),Integer.parseInt(a[3]));
        }
        int counter=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(students[j].gettotal()>students[i].gettotal()){
                    Student a=students[j];
                    students[j]=students[i];
                    students[i]=a;
                    counter++;
                }
            }
        }
        int c=1;
        for(int i=0;i<n;i++){
            if(students[i].getstatus()){
                System.out.print(c+". ");
                students[i].studentinfo();
                c++;
            }
            else{
                students[i].studentinfo();
            }
        }
        System.out.println("Sorted in "+counter+" passes");
        sc.close();
    }
}

