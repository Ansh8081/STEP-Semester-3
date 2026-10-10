package session8.classwork;
import java.util.Scanner;
abstract class Delivery{
    protected double weight,distance;
    protected double calculatedfee;
    static protected double total=0;
    Delivery(double weight,double distance){
        this.distance=distance;
        this.weight=weight;
    }
    abstract void display();
    static void displaytotal(){
        System.out.println("Total: "+String.format("%.2f", total));
    }
}
class Standard extends Delivery{
    Standard(double weight,double distance){
        super(weight, distance);
        calculatedfee=5+(0.5*weight)+(0.1*distance);
        total+=calculatedfee;
    }
    @Override
    void display() {
        System.out.println("STANDARD: "+String.format("%.2f", calculatedfee));
    }
}
class Express extends Delivery{
    Express(double weight,double distance){
        super(weight, distance);
        calculatedfee=15+weight+(0.2*distance);
        total+=calculatedfee;
    }
    @Override
    void display() {
        System.out.println("EXPRESS: "+String.format("%.2f", calculatedfee));
    }
}
class International extends Delivery{
    International(double weight,double distance,double CustomsFee){
        super(weight, distance);
        calculatedfee=25+(2.0*weight)+(0.5*distance)+CustomsFee;
        total+=calculatedfee;
    }
    @Override
    void display() {
        System.out.println("INTERNATIONAL: "+String.format("%.2f", calculatedfee));
    }
}
public class DeliveryFeeCalculator {
    static Delivery deliveryType(String deliverystatement){
        String[] a=deliverystatement.split(" ");
        double weight=Double.parseDouble(a[1]),distance=Double.parseDouble(a[2]);
        switch(a[0].toLowerCase()){
            case "standard":
                return new Standard(weight,distance);
            case "express":
                return new Express(weight,distance);
            default:
                return new International(weight, distance,Double.parseDouble(a[3]));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Delivery[] d=new Delivery[n];
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            d[i]=deliveryType(s);
        }
        for(Delivery D:d){
            D.display();
        }
        Delivery.displaytotal();
        sc.close();
    }
}
