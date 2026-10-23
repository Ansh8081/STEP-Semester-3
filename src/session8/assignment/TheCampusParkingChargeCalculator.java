package session8.assignment;
import java.util.Scanner;
abstract class Vehicle{
    static double total;
    double amount;
    int hour;
    String type;
    Vehicle(String type,int hour){
        this.type=type;
        this.hour=hour;
    }
    void display(){
        System.out.println(type+": "+String.format("%.2f", amount));
    }
    static void displaytotal(){
        System.out.println("Total: "+String.format("%.2f", total));
    }
}
class Bike extends  Vehicle{
    Bike(String type,int hour){
        super(type,hour);
        amount=hour*10;
        total+=amount;
    }
}
class Car extends  Vehicle{
    Car(String type,int hour){
        super(type,hour);
        if (hour>1)
            amount=30+20*(hour-1);
        else
            amount=30;
        total+=amount;
    }
}
class Truck extends  Vehicle{
    Truck(String type,int hour){
        super(type,hour);
        if(hour<2)
            amount=100;
        else
            amount=hour*50;
        total+=amount;
    }
}
public class TheCampusParkingChargeCalculator {
    static Vehicle vehicleType(String statement){
        String[] a=statement.split(" ");
        String type=a[0].toUpperCase();
        int hour=Integer.parseInt(a[1]);
        switch (type) {
            case "BIKE":
                return new Bike(type,hour);
            case "CAR":
                return new Car(type, hour);

            default:
                return new Truck(type, hour);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Vehicle[] v=new Vehicle[n];
        sc.nextLine();
        String statement;
        for(int i=0;i<n;i++){
            statement=sc.nextLine();
            v[i]=vehicleType(statement);
        }
        for(Vehicle V:v){
            V.display();
        }
        Vehicle.displaytotal();
        sc.close();
    }
}
