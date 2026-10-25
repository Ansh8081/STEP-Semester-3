package session9.classwork;
import java.util.Scanner;
interface Employee{
    String getname();
    double getsalary();
    default void getinfo(){
        System.out.println(getname()+": "+String.format("%.2f",getsalary()));
    }
}
class Fulltime implements Employee{
    String name;
    double salary;
    Fulltime(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    public String getname(){return name;}
    public double getsalary(){return salary;}
}
class Hourly implements Employee{
    String name;
    double salary;
    Hourly(String name,int hours,double perhour){
        this.name=name;
        if(hours>40)
            salary=40*perhour+(hours-40)*1.5*perhour;
        else
            salary=perhour*hours;
    }
    public String getname(){return name;}
    public double getsalary(){return salary;}
}
class Intern implements Employee{
    String name;
    double stipend;
    Intern(String name,double stipend){
        this.name=name;
        this.stipend=stipend;
    }
    public String getname(){return name;}
    public double getsalary(){return stipend;}
}
public class WeeklyStaffPay {
    static Employee getobject(String s){
        String[] a=s.trim().split("\\s+");
        switch(a[0].toLowerCase()){
            case "fulltime":
                return new Fulltime(a[1], Double.parseDouble(a[2]));
            case "hourly":
                return new Hourly(a[1], Integer.parseInt(a[2]), Double.parseDouble(a[3]));
            case "intern":
                return new Intern(a[1], Double.parseDouble(a[2]));
            default:
                throw new IllegalArgumentException("Invalid Employee: "+a[0]);
        }
    }
    public static void main(String[] args){
        double total=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Employee[] e=new Employee[n];
        for(int i=0;i<n;i++){
            String statement=sc.nextLine();
            e[i]=getobject(statement);
        }
        for(Employee E:e){
            E.getinfo();
            total+=E.getsalary();
        }
        System.out.println("Total Payroll: "+String.format("%.2f",total));
        sc.close();
    }
}

