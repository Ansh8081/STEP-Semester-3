package session9.assignment;
import java.util.Scanner;
interface CAB{
    String gettype();
    double getfare();
    default void getinfo(){System.out.println(gettype()+": "+String.format("%.2f",getfare()));}
}
class Mini implements CAB{
    String time,type="MINI";
    double fare;
    Mini(int distance,String time){
        this.time=time;
        if(time.equalsIgnoreCase("day")){
            if(distance*10<100){fare=100;}
            else{fare=distance*10;}
        }
        else if(time.equalsIgnoreCase("night")){
            fare=0;
        }
    }
    public String gettype(){return type;}
    public double getfare(){return fare;}
    public void getinfo(){
        if(time.equalsIgnoreCase("day")){
            System.out.println(gettype()+": "+String.format("%.2f",getfare()));
        }
        else{
            System.out.println(gettype()+": night service not available");
        }
    }
}
class Sedan implements CAB{
    String type="SEDAN";
    double fare;
    Sedan(int distance,String time){
        if(time.equalsIgnoreCase("day")){
            if(distance*14<100){fare=100;}
            else{fare=distance*14;}
        }
        else if(time.equalsIgnoreCase("night")){
            if(distance*14<100){fare=120;}
            else{fare=distance*14+0.2*distance*14;}
        }
    }
    public String gettype(){return type;}
    public double getfare(){return fare;}
}
class Suv implements CAB{
    String type="SUV";
    double fare;
    Suv(int distance,String time){
        if(time.equalsIgnoreCase("day")){
            if(distance*18<100){fare=100;}
            else{fare=distance*18;}
        }
        else if(time.equalsIgnoreCase("night")){
            if(distance*18<100){fare=120;}
            else{fare=distance*18+0.2*distance*18;}
        }
    }
    public String gettype(){return type;}
    public double getfare(){return fare;}
}
public class CityCabFareMeter {
    static CAB getobject(String s){
        String[] a=s.trim().split("\\s+");
        switch(a[0].toLowerCase()){
            case "mini":
                return new Mini(Integer.parseInt(a[1]),a[2]);
            case "sedan":
                return new Sedan(Integer.parseInt(a[1]),a[2]);
            case "suv":
                return new Suv(Integer.parseInt(a[1]),a[2]);
            default:
                throw new IllegalArgumentException("Invalid Cab: "+a[0]);
        }
    }
    public static void main(String[] args) {
        double total=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        CAB[] c=new CAB[n];
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            c[i]=getobject(s);
        }
        for(CAB C:c){
            C.getinfo();
            total+=C.getfare();
        }
        System.out.println("Total: "+String.format("%.2f",total));
        sc.close();
    }
}
