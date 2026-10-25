package session9.classwork;
import java.util.Scanner;
interface Item{
    String gettitle();
    double getfine();
    default void getinfo(){System.out.println(gettitle()+": "+String.format("%.2f",getfine()));}
}
class Book implements Item{
    String title;
    double fine;
    Book(String title,int days){
        this.title=title;
        fine=2*days;
    }
    public String gettitle(){return title;}
    public double getfine(){return fine;}
}
class Magazine implements Item{
    String title;
    double fine;
    Magazine(String title,int days){
        this.title=title;
        fine=days;
    }
    public String gettitle(){return title;}
    public double getfine(){return fine;}
}
class Dvd implements Item{
    String title;
    double fine;
    Dvd(String title,int days){
        this.title=title;
        if(days>10){fine=50;}
        else{fine=5*days;}
    }
    public String gettitle(){return title;}
    public double getfine(){return fine;}
}
public class LibraryLateFineCounter {
    static Item getobject(String s){
        String[] a=s.trim().split("\\s+");
        switch(a[0].toLowerCase()){
            case "book":
                return new Book(a[1],Integer.parseInt(a[2]));
            case "magazine":
                return new Magazine(a[1],Integer.parseInt(a[2]));
            case "dvd":
                return new Dvd(a[1],Integer.parseInt(a[2]));
            default:
                throw new IllegalArgumentException("Invalid Item: "+a[0]);
        }
    }
    public static void main(String[] args){
        double total=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Item[] i=new Item[n];
        for(int j=0;j<n;j++){
            String statement=sc.nextLine();
            i[j]=getobject(statement);
        }
        for(Item I:i){
            I.getinfo();
            total+=I.getfine();
        }
        System.out.println("Total Fines: "+String.format("%.2f",total));
        sc.close();
    }
}
