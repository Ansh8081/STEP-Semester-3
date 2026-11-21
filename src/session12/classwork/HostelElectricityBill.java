package session12.classwork;
import java.util.Scanner;

class Room{
    String room;
    int units;
    int bill;
    static int total=0;
    boolean status=true;
    Room(String room,int units){
        this.room=room;
        this.units=units;
        if(units<0){
            status=false;
            bill=0;
        }
        else if(units<=100){
            bill=50+units*3;
        }
        else if(units<=200){
            bill=50+100*3+(units-100)*5;
        }
        else{
            bill=50+100*3+100*5+(units-200)*8;
        }
        total+=bill;
    }
    void info(){
        if(status){
            System.out.println(room+": "+units+" units, bill "+bill);
        }
        else{
            System.out.println(room+": invalid reading");
        }
    }
    static int gettotal(){return total;}
}
public class HostelElectricityBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Room[] r=new Room[n];
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            String[] a=s.split(" ");
            r[i]=new Room(a[0],Integer.parseInt(a[1]));
        }
        int billed=0;
        for(Room R:r){
            if(R.status){
                R.info();
                billed++;
            }
            else{
                R.info();
            }
        }
        System.out.println("Rooms billed "+billed+", total "+Room.gettotal());
        sc.close();
    }
}

