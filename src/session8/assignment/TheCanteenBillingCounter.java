package session8.assignment;
import java.util.Scanner;
abstract class Customer{
    double amount;
    static double total;
    Customer(double amount){
        this.amount=amount;
    }
    abstract void display();
    static void displaytotal(){
        System.out.println("Total: "+String.format("%.2f", total));
    }
}
class Student extends Customer{
    double finalamount;
    Student(double amount){
        super(amount);
        finalamount=amount-0.10*amount;
        total+=finalamount;
    }
    void display(){
        System.out.println("STUDENT: "+String.format("%.2f", finalamount));
    }
}
class Staff extends Customer{
    double finalamount;
    Staff(double amount){
        super(amount);
        finalamount=amount-0.05*amount;
        total+=finalamount;
    }
    void display(){
        System.out.println("STAFF: "+String.format("%.2f", finalamount));
    }
}
class Guest extends Customer{
    double finalamount;
    Guest(double amount){
        super(amount);
        finalamount=amount+10;
        total+=finalamount;
    }
    void display(){
        System.out.println("GUEST: "+String.format("%.2f", finalamount));
    }
}
public class TheCanteenBillingCounter {
    static Customer customerType(String statement){
        String[] a=statement.split(" ");
        double amount=Double.parseDouble(a[1]);
        switch(a[0].toLowerCase()){
            case "student":
                return new Student(amount);
            case "staff":
                return new Staff(amount);
            default:
                return new Guest(amount);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Customer[] c=new Customer[n];
        sc.nextLine();
        String statement;
        for(int i=0;i<n;i++){
            statement=sc.nextLine();
            c[i]=customerType(statement);
        }
        for(Customer C:c){
            C.display();
        }
        Customer.displaytotal();
        sc.close();
    }

}

