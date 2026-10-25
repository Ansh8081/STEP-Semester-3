package session9.assignment;
import java.util.Scanner;
interface Seat{
    static final double conveniencefee=20;
    String gettype();
    double getprice();
    default void getinfo(){System.out.println(gettype()+": "+String.format("%.2f",getprice()));}
}
class Regular implements Seat{
    String type="REGULAR";
    double price;
    Regular(int count){
        price=count*(150+conveniencefee);
    }
    public String gettype(){return type;}
    public double getprice(){return price;}
}
class Premium implements Seat{
    String type="PREMIUM";
    double price;
    Premium(int count){
        price=count*(250+conveniencefee);
    }
    public String gettype(){return type;}
    public double getprice(){return price;}
}
class Recliner implements Seat{
    String type="RECLINER";
    double price;
    Recliner(int count){
        price=count*(400+conveniencefee);
    }
    public String gettype(){return type;}
    public double getprice(){return price;}
}
public class MovieTicketCounter {
    static Seat getobject(String s){
        String[] a=s.trim().split("\\s+");
        switch(a[0].toLowerCase()){
            case "regular":
                return new Regular(Integer.parseInt(a[1]));
            case "premium":
                return new Premium(Integer.parseInt(a[1]));
            case "recliner":
                return new Recliner(Integer.parseInt(a[1]));
            default:
                throw new IllegalArgumentException("Invalid Seat: "+a[0]);
        }
    }
    public static void main(String[] args) {
        double total=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Seat[] s=new Seat[n];
        for(int i=0;i<n;i++){
            String statement=sc.nextLine();
            s[i]=getobject(statement);
        }
        for(Seat S:s){
            S.getinfo();
            total+=S.getprice();
        }
        System.out.println("Total: "+String.format("%.2f",total));
        sc.close();
    }
}
