package session12.classwork;
import java.util.Scanner;

interface PaymentMode{
    default double processPayment(double amount){
        return amount;
    }
    void Payment();
    double processed();
}
class CashPayment implements PaymentMode{
    double amount;
    double fee=0;
    CashPayment(double amount){this.amount=amount;}
    public void Payment(){
        System.out.println("Cash: amount "+amount+", fee "+fee+", processed "+processPayment(amount)+".");
    }
    public double processed(){
        return processPayment(amount);
    }
}
class UpiPayment implements PaymentMode{
    double amount;
    double fee=0;
    UpiPayment(double amount){this.amount=amount;}
    public void Payment(){
        System.out.println("UPI: amount "+amount+", fee "+fee+", processed "+processPayment(amount)+".");
    }
    public double processed(){
        return processPayment(amount);
    }
}
class CardPayment implements PaymentMode{
    double amount;
    double fee=2;
    CardPayment(double amount){this.amount=amount;}
    public double processPayment(double amount){
        return amount*0.02+amount;
    }
    public void Payment(){
        System.out.println("Card: amount "+amount+", fee "+fee+", processed "+processPayment(amount)+".");
    }
    public double processed(){
        return processPayment(amount);
    }
}
public class PaymentProcessing {
    static PaymentMode getobject(Scanner sc){
        String s=sc.nextLine();
        String[] a=s.split(" ");
        switch (a[0].toLowerCase()) {
            case "cash":
                return new CashPayment(Double.parseDouble(a[1]));
            case "upi":
                return new UpiPayment(Double.parseDouble(a[1]));
            case "card":
                return new CardPayment(Double.parseDouble(a[1]));
            default:
                throw new IllegalArgumentException("Invalid Mode of Payment: "+a[0]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        PaymentMode[] p=new PaymentMode[n];
        int total=0;
        for(int i=0;i<n;i++){
            p[i]=getobject(sc);
        }
        for(PaymentMode P:p){
            total+=P.processed();
            P.Payment();
        }
        System.out.println("Total Amount Processed: "+total);
        sc.close();
    }

}
