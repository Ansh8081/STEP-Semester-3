package session8.assignment;
import java.util.Scanner;

abstract class Employee{
    double salary,bonus;
    String name;
    static double totalbonus;
    Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    void display(){
        System.out.println(name+": "+String.format("%.2f",bonus));
    }
    static void displaytotalbonus(){
        System.out.println("Total Bonus: "+String.format("%.2f",totalbonus));
    }
}
class Fulltime extends Employee{
    Fulltime(String name,double salary){
        super( name, salary);
        bonus=0.10*salary;
        totalbonus+=bonus;
    }
}
class Parttime extends Employee{
    Parttime(String name,double salary){
        super(name, salary);
        bonus=0.05*salary;
        totalbonus+=bonus;
    }
}
class Intern extends Employee{
    Intern(String name,double salary){
        super(name, salary);
        bonus=2000;
        totalbonus+=bonus;
    }
}
public class TheFestivalBonusCalculator {
    static Employee employeetype(String s){
        String[] a=s.split(" ");
        switch(a[0].toUpperCase()){
            case "FULLTIME":
                return new Fulltime(a[1], Double.parseDouble(a[2]));
            case "PARTTIME":
                return new Parttime(a[1], Double.parseDouble(a[2]));
            default:
                return new Intern(a[1], Double.parseDouble(a[2]));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Employee[] e=new Employee[n];
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            e[i]=employeetype(s);
        }
        for(int i=0;i<n;i++){
            e[i].display();
        }
        Employee.displaytotalbonus();
        sc.close();
    }
}
