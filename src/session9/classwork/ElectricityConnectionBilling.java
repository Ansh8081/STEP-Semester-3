package session9.classwork;
import java.util.Scanner;
interface Type{
    String gettype();
    double getbill();
    default void getinfo(){System.out.println(gettype()+": "+String.format("%.2f",getbill()));}
}
class Home implements Type{
    String type="HOME";
    double bill;
    Home(int unit){
        if(unit>100){bill=100*5+(unit-100)*7;}
        else{bill=5*unit;}
    }
    public String gettype(){return type;}
    public double getbill(){return bill;}
}
class Shop implements Type{
    String type="SHOP";
    double bill;
    Shop(int unit){
        bill=8*unit+100;
    }
    public String gettype(){return type;}
    public double getbill(){return bill;}
}
class Factory implements Type{
    String type="FACTORY";
    double bill;
    Factory(int unit){
        if(unit*6<1000){bill=1000;}
        else{bill=unit*6;}
    }
    public String gettype(){return type;}
    public double getbill(){return bill;}
}
public class ElectricityConnectionBilling {
    static Type getobject(String s){
        String a[]=s.trim().split("\\s+");
        switch(a[0].toLowerCase()){
            case "home":
                return new Home(Integer.parseInt(a[1]));
            case "shop":
                return new Shop(Integer.parseInt(a[1]));
            case "factory":
                return new Factory(Integer.parseInt(a[1]));
            default:
                throw new IllegalArgumentException("Invalid Type: "+a[0]);
        }
    }
    public static void main(String[] args){
        double total=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Type[] t=new Type[n];
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            t[i]=getobject(s);
        }
        for(Type T:t){
            T.getinfo();
            total+=T.getbill();
        }
        System.out.println("Total: "+String.format("%.2f",total));
        sc.close();
    }
}
