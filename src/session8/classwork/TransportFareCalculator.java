package session8.classwork;
import java.util.Scanner;
abstract class Transport{
    protected double distance,calculatedfare;
    static protected double totalfare=0;
    Transport(double distance){
        this.distance=distance;
    }
    abstract void display();
    static void displaytotal(){
        System.out.println("Total: "+String.format("%.2f",totalfare));
    }
}
class Bus extends Transport{
    Bus(double distance){
        super(distance);
        if(2+distance*0.1>=10)
            calculatedfare=10;
        else
            calculatedfare=2+distance*0.1;
        totalfare+=calculatedfare;
    }
    @Override
    void display(){
        System.out.println("Bus: "+String.format("%.2f",calculatedfare));
    }
}
class Train extends Transport{
    Train(double distance){
        super(distance);
        calculatedfare=3+distance*0.15;
        totalfare+=calculatedfare;
    }
    @Override
    void display(){
        System.out.println("Train: "+String.format("%.2f",calculatedfare));
    }
}
class Metro extends Transport{
    Metro(double distance,double PeakHourFactor){
        super(distance);
        calculatedfare=(1.5+distance*0.2)*PeakHourFactor;
        totalfare+=calculatedfare;
    }
    @Override
    void display(){
        System.out.println("Metro: "+String.format("%.2f",calculatedfare));
    }
}

public class TransportFareCalculator {
    static Transport transportType(String farestatement){
        String[] a=farestatement.split(" ");
        double distance=Double.parseDouble(a[1]);
        switch (a[0].toLowerCase()) {
            case "bus":
                return new Bus(distance);
            case "train":
                return new Train(distance);
            default:
                return new Metro(distance,Double.parseDouble(a[2]));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Transport[] t=new Transport[n];
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            t[i]=transportType(s);
        }
        for(Transport T:t){
            T.display();
        }
        Transport.displaytotal();
        sc.close();

    }
}
