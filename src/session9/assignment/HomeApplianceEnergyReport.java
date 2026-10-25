package session9.assignment;
import java.util.Scanner;
interface Appliance{
    String getappliance();
    double getunit();
    double getcost();
    String getsaver();
    default void getinfo(){
        if(this instanceof Saver)
            System.out.println(getappliance()+": Units="+String.format("%.2f",((Saver)this).getsaverunit())+" Cost="+String.format("%.2f",getcost()));
        else{
            if(getsaver().equals("notsaver"))
                System.out.println(getappliance()+": Units="+String.format("%.2f",getunit())+" Cost="+String.format("%.2f",getcost()));
            else
                System.out.println(getappliance()+": saver mode not supported");
        }
    }
}
interface Saver{
    double getsaverunit();
}
class Fridge implements Appliance{
    String Appliance="FRIDGE";
    String saver="notsaver";
    double unit,cost;
    Fridge(int hour,String saver){
        if(saver.equalsIgnoreCase("saver")){
            this.saver=saver;
        }
        else{
            unit=hour*150*0.001;
            cost=unit*8;
        }
    }
    public String getappliance(){return Appliance;}
    public String getsaver(){return saver;}
    public double getunit(){return unit;}
    public double getcost(){return cost;}
}
class Tv implements Appliance{
    String Appliance="TV";
    String saver="notsaver";
    double unit,cost;
    Tv(int hour,String saver){
        if(saver.equalsIgnoreCase("saver")){
            this.saver=saver;
        }
        else{
            unit=hour*100*0.001;
            cost=unit*8;
        }
    }
    public String getappliance(){return Appliance;}
    public String getsaver(){return saver;}
    public double getunit(){return unit;}
    public double getcost(){return cost;}
}
class Ac implements Appliance,Saver{
    String Appliance="AC";
    String saver="notsaver";
    double unit,cost;
    Ac(int hour,String saver){
        if(saver.equalsIgnoreCase("saver")){
            this.saver=saver;
        }
        unit=hour*1500*0.001;
        cost=getsaverunit()*8;
    }
    public String getappliance(){return Appliance;}
    public String getsaver(){return saver;}
    public double getunit(){return unit;}
    public double getcost(){return cost;}
    public double getsaverunit(){return 0.75*getunit();}
}
class Washer implements Appliance,Saver{
    String Appliance="WASHER";
    String saver="notsaver";
    double unit,cost;
    Washer(int hour,String saver){
        if(saver.equalsIgnoreCase("saver")){
            this.saver=saver;
        }
        unit=hour*500*0.001;
        cost=getsaverunit()*8;
    }
    public String getappliance(){return Appliance;}
    public String getsaver(){return saver;}
    public double getunit(){return unit;}
    public double getcost(){return cost;}
    public double getsaverunit(){return 0.75*getunit();}
}
public class HomeApplianceEnergyReport {
    static Appliance getobject(String s){
        String[] a=s.trim().split("\\s+");
        if(a.length==2){
            switch(a[0].toLowerCase()){
                case "fridge":
                    return new Fridge(Integer.parseInt(a[1]),"notsaver");
                case "tv":
                    return new Tv(Integer.parseInt(a[1]),"notsaver");
                default:
                    throw new IllegalArgumentException("Invalid Appliance: "+a[0]);
            }
        }
        else{
            switch(a[0].toLowerCase()){
                case "ac":
                    return new Ac(Integer.parseInt(a[1]),a[2]);
                case "washer":
                    return new Washer(Integer.parseInt(a[1]),a[2]);
                case "fridge":
                    return new Fridge(Integer.parseInt(a[1]),a[2]);
                case "tv":
                    return new Tv(Integer.parseInt(a[1]),a[2]);
                default:
                    throw new IllegalArgumentException("Invalid Appliance: "+a[0]);
            }
        }
    }
    public static void main(String[] args) {
        double total=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Appliance[] a=new Appliance[n];
        for(int i=0;i<n;i++){
            String statement=sc.nextLine();
            a[i]=getobject(statement);
        }
        for(Appliance A:a){
            A.getinfo();
            total+=A.getcost();
        }
        System.out.println("Total Cost: "+String.format("%.2f",total));
        sc.close();
    }
}

