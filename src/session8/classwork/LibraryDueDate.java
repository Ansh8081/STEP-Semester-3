package session8.classwork;
import java.util.Scanner;
abstract class DueDateCalculator{
    protected String currentdate="2023-10-26";
    protected String deudate;
    protected int borrowperiod;
    protected String title;
    DueDateCalculator(String title){
        this.title=title;
    }
    void display(){
        System.out.println(title+": "+deudate);
    }
}
class Book extends DueDateCalculator{
    Book(String title){
        super(title);
        borrowperiod=14;
        int day=(Integer.parseInt(currentdate.substring(8))+borrowperiod-1)%31+1;
        int month=Integer.parseInt(currentdate.substring(5,7));
        if(Integer.parseInt(currentdate.substring(8))+borrowperiod>31){
            month++;
        }
        deudate=currentdate.substring(0,5)+month+"-"+String.format("%02d",day);
    }
}
class Dvd extends DueDateCalculator{
    Dvd(String title){
        super(title);
        borrowperiod=7;
        int day=(Integer.parseInt(currentdate.substring(8))+borrowperiod-1)%31+1;
        int month=Integer.parseInt(currentdate.substring(5,7));
        if(Integer.parseInt(currentdate.substring(8))+borrowperiod>31){
            month++;
        }
        deudate=currentdate.substring(0,5)+month+"-"+String.format("%02d",day);
    }
}
class Magazine extends DueDateCalculator{
    Magazine(String title){
        super(title);
        borrowperiod=3;
        int day=(Integer.parseInt(currentdate.substring(8))+borrowperiod-1)%31+1;
        int month=Integer.parseInt(currentdate.substring(5,7));
        if(Integer.parseInt(currentdate.substring(8))+borrowperiod>31){
            month++;
        }
        deudate=currentdate.substring(0,5)+month+"-"+String.format("%02d",day);
    }
}
public class LibraryDueDate {
    static DueDateCalculator itemType(String itemstatement){
        String[] a={itemstatement.substring(0,itemstatement.indexOf(" ")),itemstatement.substring(itemstatement.indexOf(" ")+1)};
        String title=(a[1].substring(1,(a[1].length()-1)));
        switch (a[0].toLowerCase()) {
            case "book":
                return new Book(title);
            case "dvd":
                return new Dvd(title);
            default:
                return new Magazine(title);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        DueDateCalculator[] d=new DueDateCalculator[n];
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            d[i]=itemType(s);
        }
        for(DueDateCalculator D:d){
            D.display();
        }
        sc.close();
    }
}
