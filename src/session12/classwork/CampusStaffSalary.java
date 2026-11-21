package session12.classwork;
import java.util.Scanner;
class Staff{
    static double total=0;
    String type;
    String name;
    double salary;
    double bonus;
    Staff(String name,double salary){
        bonus=0;
        type="Staff";
        this.name=name;
        this.salary=salary;
        total+=salary;
    }
    void getinfo(){
        System.out.println(name+" ("+type+"): base "+salary+", bonus "+bonus+", total "+(bonus+salary));
    }
    static void gettotal(){
        System.out.println("Grand Total Salary: "+total);
    }
}
class Teacher extends Staff{
    Teacher(String name,double salary){
        super(name, salary);
        type="Teacher";
        bonus=5000;
        total+=bonus;
    }
}
class LabAssistant extends Staff{
    LabAssistant(String name,double salary){
        super(name, salary);
        type="LabAssistant";
        bonus=2000;
        total+=bonus;
    }
}
public class CampusStaffSalary {
    static Staff getobject(Scanner sc){
        String s=sc.nextLine();
        String[] a=s.split(" ");
        switch (a[0].toLowerCase()) {
            case "teacher":
                return new Teacher(a[1],Double.parseDouble(a[2]));
            case "labassistant":
                return new LabAssistant(a[1],Double.parseDouble(a[2]));
            case "staff":
                return new Staff(a[1],Double.parseDouble(a[2]));
            default:
                throw new IllegalArgumentException("Invalid Type: "+a[0]);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Staff[] s=new Staff[n];
        for(int i=0;i<n;i++){
            s[i]=getobject(sc);
        }
        sc.close();
        for(Staff S:s){
            S.getinfo();
        }
        Staff.gettotal();
    }
}