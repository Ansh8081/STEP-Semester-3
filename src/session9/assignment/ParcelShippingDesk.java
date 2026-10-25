package session9.assignment;
import java.util.Scanner;
interface Insurable{
    double getinsurance();
}
interface Shipping{
    String gettype();
    double getcharge();
    double gettotal();
    default void getinfo(){
        if(this instanceof Insurable){
            System.out.println(gettype()+": Charge="+String.format("%.2f",getcharge())+" Insurance="+String.format("%.2f",((Insurable)this).getinsurance())+" Total="+String.format("%.2f",gettotal()));
        }
        else{
            System.out.println(gettype()+": Charge="+String.format("%.2f",getcharge())+" Insurance="+String.format("%.2f",0.0)+" Total="+String.format("%.2f",gettotal()));
        }
    }
}
class Standard implements Shipping{
    double charge,total;
    String type="STANDARD";
    Standard(int weight,double declaredValue){
        charge=10*weight+40;
        total=charge;
    }
    public String gettype(){return type;}
    public double getcharge(){return charge;}
    public double gettotal(){return total;}
}
class Express implements Shipping,Insurable{
    double insurance,charge,total;
    String type="EXPRESS";
    Express(int weight,double declaredValue){
        charge=15*weight+80;
        insurance=0.02*declaredValue;
        total=charge+insurance;
    }
    public String gettype(){return type;}
    public double getinsurance(){return insurance;}
    public double getcharge(){return charge;}
    public double gettotal(){return total;}
}
class Fragile implements Shipping,Insurable{
    double insurance,charge,total;
    String type="FRAGILE";
    Fragile(int weight,double declaredValue){
        charge=10*weight+90;
        insurance=0.02*declaredValue;
        total=charge+insurance;
    }
    public String gettype(){return type;}
    public double getinsurance(){return insurance;}
    public double getcharge(){return charge;}
    public double gettotal(){return total;}
}
public class ParcelShippingDesk {
    static Shipping getobject(String s){
        String[] a=s.trim().split("\\s+");
        switch(a[0].toLowerCase()){
            case "standard":
                return new Standard(Integer.parseInt(a[1]),Double.parseDouble(a[2]));
            case "express":
                return new Express(Integer.parseInt(a[1]),Double.parseDouble(a[2]));
            case "fragile":
                return new Fragile(Integer.parseInt(a[1]),Double.parseDouble(a[2]));
            default:
                throw new IllegalArgumentException("Invalid Shipping Type: "+a[0]);
        }
    }
    public static void main(String[] args) {
        double total=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Shipping[] s=new Shipping[n];
        for(int i=0;i<n;i++){
            String statement=sc.nextLine();
            s[i]=getobject(statement);
        }
        for(int i=0;i<n;i++){
            s[i].getinfo();
            total+=s[i].gettotal();
        }
        System.out.println("Grand Total: "+String.format("%.2f", total));
        sc.close();
    }
}
