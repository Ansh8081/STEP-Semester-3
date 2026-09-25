package session6.classwork;
class MessWallet{
    private double balance;
    public MessWallet(double balance){
        if(balance>=0)
            this.balance=balance;
        else{
            this.balance=0;
            System.out.println("Invalid Balance Entered! Setting balance to 0");
        }
    }
    public void topUp(double amount){
        if(amount <= 0)
            System.out.println("Invalid TopUp amount!");
        else{
            balance+=amount;
            System.out.println("Balance after top-up: "+balance);
        }
    }
    public void deduct(double amount){
        if(amount>balance)
            System.out.println("Deduct rejected: insufficient balance");
        else{
            balance-=amount;
            System.out.println("Balance after deduct: "+balance);
        }
    }
    public void getBalance(){
        System.out.println("Final balance: "+balance);
    }
}
public class HostelMessWallet {
    public static void main(String[] args) {
        MessWallet m=new MessWallet(500);
        m.topUp(200);
        m.deduct(1000);
        m.getBalance();
    }
}
