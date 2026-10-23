package session8.assignment;
import java.time.LocalDate;
import java.util.Scanner;
abstract class Plan{
    String startdate,name,expirydate;
    int validity;
    Plan(String name,String startdate){
        this.name=name;
        this.startdate=startdate;
    }
    void display(){
        System.out.println(name+": "+expirydate);
    }
}
class Basic extends Plan{
    int validity=30;
    Basic(String name,String startdate){
        super(name, startdate);
        expirydate=LocalDate.parse(startdate).plusDays(validity).toString();
    }
}
class Premium extends Plan{
    int validity=365;
    Premium(String name,String startdate){
        super(name, startdate);
        expirydate=LocalDate.parse(startdate).plusDays(validity).toString();
    }
}
class Standard extends Plan{
    int validity=90;
    Standard(String name,String startdate){
        super(name, startdate);
        expirydate=LocalDate.parse(startdate).plusDays(validity).toString();
    }
}
public class StreamingPlanRenewalReminder {
    static Plan plantype(String s){
        String[] a=s.split(" ");
        switch(a[0].toLowerCase()){
            case "basic":
                return new Basic(a[1],a[2]);
            case "standard":
                return new Standard(a[1],a[2]);
            default:
                return new Premium(a[1],a[2]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Plan[] p=new Plan[n];
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            p[i]=plantype(s);
        }
        for(Plan P:p){
            P.display();
        }
        sc.close();
    }
}
