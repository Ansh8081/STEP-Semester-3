package session8.classwork;
import java.util.Scanner;
abstract class Payment{
    protected double amount;
    protected int percentfee;
    protected double finalamount;
    static protected double total;
    Payment(double amount){
        this.amount=amount;
    }
    abstract void display();
    static void total(){
        System.out.println("Total: "+String.format("%.2f",total));
    }
}
class Card extends Payment{
    Card(double amount){
        super(amount);
        percentfee=2;
        finalamount=percentfee*amount/100+amount;
        total+=finalamount;
    }
    void display(){
        System.out.println("CARD: "+String.format("%.2f", finalamount));
    }
}
class BankTransfer extends Payment{
    BankTransfer(double amount){
        super(amount);
        total+=amount;
    }
    void display(){
        System.out.println("BANKTRANSFER: "+String.format("%.2f",amount));
    }
}
class Wallet extends Payment{
    Wallet(double amount){
        super(amount);
        percentfee=1;
        finalamount=percentfee*amount/100+amount;
        total+=finalamount;
    }
    void display(){
        System.out.println("WALLET: "+String.format("%.2f", finalamount));
    }
}
public class PaymentFeeCalculation {
    static Payment paymentType(String paystatement){
        String[] a=paystatement.split(" ");
        double amount=Double.parseDouble(a[1]);
        switch (a[0].toLowerCase()) {
            case "card":
                return new Card(amount);
            case "wallet":
                return new Wallet(amount);
            default:
                return new BankTransfer(amount);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Payment[] p=new Payment[n];
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            p[i]=paymentType(s);
        }
        for(Payment P:p){
            P.display();
        }
        Payment.total();
        sc.close();
    }
}
