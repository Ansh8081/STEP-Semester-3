package session8.assignment;
import java.util.Scanner;
abstract class Room{
    double bill;
    int units;
    static double total=0;
    abstract void display();
    static void displaytotal(){
        System.out.println("Total: "+String.format("%.2f",total));
    }
}
class Single extends Room{
    Single(int units){
        this.units=units;
        bill=8*units;
        total+=bill;
    }
    void display(){
        System.out.println("SINGLE: "+String.format("%.2f",bill));
    }
}
class Shared extends Room{
    int occupants;
    Shared(int units,int occupants){
        this.occupants=occupants;
        this.units=units;
        bill=units*6/(double)occupants;
        total+=bill;
    }
    void display(){
        System.out.println("SHARED: "+String.format("%.2f",bill));
    }
}
class Ac extends Room{
    Ac(int units){
        this.units=units;
        bill=200+units*10;
        total+=bill;
    }
    void display(){
        System.out.println("AC: "+String.format("%.2f",bill));
    }
}
public class HostelElectricityBill {
    static Room roomtype(String statement){
        String a[]=statement.split(" ");
        switch(a[0].toLowerCase()){
            case "single":
                return new Single(Integer.parseInt(a[1]));
            case "shared":
                return new Shared(Integer.parseInt(a[1]),Integer.parseInt(a[2]));
            default:
                return new Ac(Integer.parseInt(a[1]));
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Room[] r=new Room[n];
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            r[i]=roomtype(s);
        }
        for(int i=0;i<n;i++){
            r[i].display();
        }
        Room.displaytotal();
        sc.close();
    }
}
