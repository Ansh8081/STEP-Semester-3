package session9.classwork;
import java.util.Scanner;

interface Mode{
    static final double bookingfee=50;
    String getmode();
    double getfare();
    default void getinfo(){System.out.println(getmode()+": "+String.format("%.2f",getfare()));}
}
class Bus implements Mode{
    String mode="BUS";
    double fare;
    Bus(int distance){
        fare=bookingfee+2*distance;
    }
    public String getmode(){return mode;}
    public double getfare(){return fare;}
}
class Train implements Mode{
    String mode="TRAIN";
    double fare;
    Train(int distance){
        fare=bookingfee+1.5*distance;
    }
    public String getmode(){return mode;}
    public double getfare(){return fare;}
}
class Flight implements Mode{
    String mode="FLIGHT";
    double fare;
    Flight(int distance){
        fare=bookingfee+2500+4*distance;
    }
    public String getmode(){return mode;}
    public double getfare(){return fare;}
}
public class TravelBookingCommonFee {
    static Mode getobject(String s){
        String[] a=s.trim().split("\\s+");
        switch(a[0].toLowerCase()){
            case "bus":
                return new Bus(Integer.parseInt(a[1]));
            case "train":
                return new Train(Integer.parseInt(a[1]));
            case "flight":
                return new Flight(Integer.parseInt(a[1]));
            default:
                throw new IllegalArgumentException("Invalid Mode: "+a[0]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Mode[] m=new Mode[n];
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            m[i]=getobject(s);
        }
        for(Mode M:m){
            M.getinfo();
        }
        sc.close();
    }
}
