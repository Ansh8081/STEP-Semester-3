package session9.assignment;
import java.util.Scanner;
interface Student{
    String getname();
    double getfee();
    default void getinfo(){System.out.println(getname()+": "+String.format("%.2f",getfee()));}
}
class Day_Scholar implements Student{
    String name;
    double fee;
    Day_Scholar(String name){
        this.name=name;
        fee=40000+12000;
    }
    public String getname(){return name;}
    public double getfee(){return fee;}
}
class Scholarship implements Student{
    String name;
    double fee;
    Scholarship(String name){
        this.name=name;
        fee=20000+12000;
    }
    public String getname(){return name;}
    public double getfee(){return fee;}
}
class Hosteller implements Student{
    String name;
    double fee;
    Hosteller(String name){
        this.name=name;
        fee=40000+60000;
    }
    public String getname(){return name;}
    public double getfee(){return fee;}
}
public class CollegeFeeCounter {
    static Student getobject(String s){
        String[] a=s.trim().split("\\s+");
        switch(a[0].toLowerCase()){
            case "day_scholar":
                return new Day_Scholar(a[1]);
            case "scholar":
                return new Scholarship(a[1]);
            case "hosteller":
                return new Hosteller(a[1]);
            default:
                throw new IllegalArgumentException("Invalid Student: "+a[0]);
        }
    }
    public static void main(String[] args) {
        double total=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Student[] s=new Student[n];
        for(int i=0;i<n;i++){
            String statement=sc.nextLine();
            s[i]=getobject(statement);
        }
        for(Student S:s){
            S.getinfo();
            total+=S.getfee();
        }
        System.out.println("Total Collected: "+String.format("%.2f",total));
        sc.close();
    }
}

