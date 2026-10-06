package session7.classwork;
class PiggyBank{
    private double balance;
    private String id;
    PiggyBank(String id){
        this.id=id;
        balance=0;
    }
    void deposit(double amount){
        if(amount>0)
            balance+=amount;
        else
            System.out.println("Invalid Amount");
    }
    void withdraw(double amount){
        if(amount<=balance)
            balance-=amount;
        else
            System.out.println("Insufficient Savigs");
    }
    void getbalance(){
        System.out.println("Savings: "+balance);
    }
}
public class ThePiggyBank{
    public static void main(String[] args) {
        PiggyBank pb = new PiggyBank("PB-1");
        pb.deposit(100);
        pb.getbalance();
        pb.withdraw(30);
        pb.getbalance();
        pb.withdraw(500);
        pb.getbalance();
    }
}